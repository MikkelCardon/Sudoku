package gui;

import application.controller.Controller;
import application.controller.SetBoard;
import application.model.Cell;
import gui.components.PrimaryWindow;
import javafx.application.Application;
import storage.Storage;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        initStorage();
        Application.launch(PrimaryWindow.class);

        printBoard();

        Controller.run();

        System.out.println("\n ********SOLVED************");
        printBoard();
    }

    private static void printBoard(){
        ArrayList<ArrayList<Cell>> rows = Storage.getRows();

        for (ArrayList<Cell> row : rows) {
            if (rows.indexOf(row) % 3 == 0 && rows.indexOf(row) != 0)
                System.out.println("----------------------");

            for (Cell cell : row) {
                if (cell.getColumn() % 3 == 0 && cell.getColumn() != 0)
                    System.out.print("| ");
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static void initStorage() throws FileNotFoundException {
        Controller.createGame();
        SetBoard.setPredefined();
    }
}
