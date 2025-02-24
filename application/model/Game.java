package application.model;

import storage.Storage;

import java.util.ArrayList;

public class Game {
    int size = 9;

    public Game() {
        createCells();
    }

    private static ArrayList<Cell> allCells = new ArrayList<>();

    private void createCells() {
        for (int colum = 0; colum < 9; colum++) {
            for (int row = 0; row < 9; row++) {
                Cell newCell = new Cell(row, colum);
                allCells.add(newCell);
            }
        }
    }

    private void createRows(){
        for (int currentRow = 0; currentRow < 9; currentRow++) {
            ArrayList<Cell> newRow = new ArrayList<>();

            for (Cell cell : allCells) {
                if (cell.getRow() == currentRow){
                    newRow.add(cell);
                }
            }
            Storage.addToRow(newRow);
        }

        for (int currentColumn = 0; currentColumn < 9; currentColumn++) {
            ArrayList<Cell> newColumn = new ArrayList<>();

            for (Cell cell : allCells) {
                if (cell.getColumn() == currentColumn){
                    newColumn.add(cell);
                }
            }
            Storage.addToColumn(newColumn);
        }
    }



    public static void generateRegions() {
        for (int i = 0; i < 9; i++) {
            Storage.addRegion(new ArrayList<>());
        }


        for (Cell cell : allCells) {
            int region = (cell.getRow() / 3) * 3 + (cell.getColumn() / 3);
            Storage.addToRegion(cell, region);
        }
    }

}
