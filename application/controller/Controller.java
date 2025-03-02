package application.controller;

import application.model.Cell;
import application.model.Game;
import gui.components.PrimaryWindow;
import javafx.animation.AnimationTimer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import storage.Storage;

import java.util.ArrayList;

public class Controller {

    public static void createGame(){
        Game game = new Game();

    }

    private static ArrayList<Cell> cells = new ArrayList<>();

    public static void run(){
        runProgram();
        PrimaryWindow.updateLabels();
    }

    public static void runProgram(){
        cells = Storage.getAllCells();
        final int[] cellNumber = {findNext(-1)};



        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(0.5), actionEvent ->{
            if (cellNumber[0] >= cells.size()) return;
            int newNumb = nextNumber(cells.get(cellNumber[0]));

            if (newNumb == -1){
                cells.get(cellNumber[0]).setDefault();
                cellNumber[0] = findPrevious(cellNumber[0]);
            } else{
                cells.get(cellNumber[0]).setValue(newNumb);
                cellNumber[0] = findNext(cellNumber[0]);
                if (cellNumber[0] == -1){
                    return;
                }
            }
            PrimaryWindow.updateLabels();
        })
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        // Check condition to stop the timeline
        AnimationTimer checker = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (cellNumber[0] == -1 || cellNumber[0] >= cells.size()) {
                    timeline.stop();
                    this.stop();
                }
            }
        };
        checker.start();
    }



    public static int findNext(int cellNumber){
        cellNumber++;
        while(cellNumber < cells.size() && cells.get(cellNumber).isFixed()){
            cellNumber++;
        }

        if(cellNumber > cells.size()){
            return -1;
        }
        return cellNumber;
    }

    public static int findPrevious(int cellNumber){
        cellNumber--;
        while(cells.get(cellNumber).isFixed()){
            cellNumber--;
        }
        return cellNumber;
    }



    public static int nextNumber(Cell cell){
        ArrayList<Integer> numbers = new ArrayList<>();

        int row = cell.getRow();
        int column = cell.getColumn();

        //Add all numbers from row
        for (Cell rowCell : Storage.getRows().get(row)) {
            int rowNumbers = rowCell.getValue();
            numbers.add(rowNumbers);
        }

        //Add all numbers from column
        for (Cell columnCell : Storage.getColumns().get(column)) {
            int columnNumbers = columnCell.getValue();
            numbers.add(columnNumbers);
        }

        //Add all numbers from region
        for (ArrayList<Cell> region : Storage.getRegions()) {
            if (region.contains(cell)){
                for (Cell eachCell : region) {
                    int number = eachCell.getValue();
                    numbers.add(number);
                }
                break;
            }
        }
        int newNumb = -1;
        for (int i = 1; i < 11; i++) {
            if (!numbers.contains(i) && i > cell.getValue()){
                newNumb = i;
                break;
            }
        }

        if (newNumb > 9){
            return -1;
        }
        return newNumb;
    }


}
