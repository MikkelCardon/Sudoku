package gui;

import application.controller.Controller;
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
    }

    private static void initStorage() throws FileNotFoundException {
        Controller.createGame();
    }
}
