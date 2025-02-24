package storage;

import application.model.Cell;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Storage {

    private static ArrayList<ArrayList<Cell>> rows = new ArrayList<>();
    private static ArrayList<ArrayList<Cell>> columns = new ArrayList<>();
    private static ArrayList<ArrayList<Cell>> regions = new ArrayList<>();

    private static ArrayList<Cell> allCells = new ArrayList<>();



    public static ArrayList<ArrayList<Cell>> getRows() {
        return new ArrayList<>(rows);
    }

    public static ArrayList<ArrayList<Cell>> getColumns() {
        return new ArrayList<>(columns);
    }

    public static ArrayList<ArrayList<Cell>> getRegions() {
        return new ArrayList<>(regions);
    }


    public static ArrayList<Cell> getAllCells(){
        return  new ArrayList<>(allCells);
    }

    /*                  */
    public static void addToRow(ArrayList<Cell> row){
       rows.add(row);
    }

    public static void addToColumn(ArrayList<Cell> column){
        columns.add(column);
    }

    public static void addRegion(ArrayList<Cell> newList){
        regions.add(newList);
    }

    public static void addToRegion(Cell cell, int region){
        regions.get(region).add(cell);
    }

    public static void setAllCells(ArrayList<Cell> cells){
        allCells.addAll(cells);
    }

}
