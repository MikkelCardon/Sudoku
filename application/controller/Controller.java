package application.controller;

import application.model.Cell;
import application.model.Game;
import storage.Storage;

import java.util.ArrayList;

public class Controller {

    public static void createGame(){
        Game game = new Game();

    }

    private static ArrayList<Cell> cells = new ArrayList<>();

    public static void run(){
        cells = Storage.getAllCells();
        int cellNumber = findNext(-1);

        while(cellNumber <= cells.size()){


            int newNumb = nextNumber(cells.get(cellNumber));

            if (newNumb == -1){
                cells.get(cellNumber).setDefault();
                cellNumber = findPrevious(cellNumber);
            } else{
                cells.get(cellNumber).setValue(newNumb);
                cellNumber = findNext(cellNumber);
                if (cellNumber == -1){
                    return;
                }
            }
        }
    }

    public static int findNext(int cellNumber){
        cellNumber++;
        while(cellNumber < cells.size() && cells.get(cellNumber).isFixed()){
            cellNumber++;
        }

        if(cellNumber >= cells.size()){
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

    public static boolean acceptInput(){
        return false;
    }


}
