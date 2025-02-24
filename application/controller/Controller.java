package application.controller;

import application.model.Cell;
import application.model.Game;
import storage.Storage;

import java.util.ArrayList;

public class Controller {

    public static void createGame(){
        Game game = new Game();

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
            }
        }
        int newNumb = -1;
        for (int i = 0; i < 11; i++) {
            if (!numbers.contains(i)){
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
