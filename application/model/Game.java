package application.model;

import storage.Storage;

import java.util.ArrayList;

public class Game {
    int size = 9;

    public Game() {
        createCells();

        createRows();
        generateRegions();
    }

    private static ArrayList<Cell> allCells = new ArrayList<>();

    private void createCells() {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                Cell newCell = new Cell(row, column);
                allCells.add(newCell);
            }
        }
        Storage.setAllCells(allCells);
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



    public void generateRegions() {
        for (int i = 0; i < 9; i++) {
            Storage.addRegion(new ArrayList<>());
        }


        for (Cell cell : allCells) {
            int region = (cell.getRow() / 3) * 3 + (cell.getColumn() / 3);
            Storage.addToRegion(cell, region);
        }
    }

}
