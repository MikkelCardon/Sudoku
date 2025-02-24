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

        //Add all numbers from region
        for (ArrayList<Cell> region : Storage.getRegions()) {
            if (region.contains(cell)){
                for (Cell eachCell : region) {
                    int number = Integer.parseInt(eachCell.getValue());
                    numbers.add(number);
                }
            }
        }


        return -1;
    }

    public static boolean acceptInput(){
        return false;
    }


}
