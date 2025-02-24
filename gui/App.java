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
        //Application.launch(PrimaryWindow.class);
        //TODO: Fjern kommentering når GUI skal køre
        for (ArrayList<Cell> row : Storage.getRows()) {
            for (Cell cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        Cell cell = Storage.getAllCells().getFirst();
        System.out.println("Controller.nextNumber(cell) = " + Controller.nextNumber(cell));
    }

    private static void initStorage() throws FileNotFoundException {
        Controller.createGame();
        SetBoard.setPredefined();
    }
}
