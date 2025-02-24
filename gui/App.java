package gui;

import application.controller.Controller;
import gui.components.PrimaryWindow;
import javafx.application.Application;
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        initStorage();
        Application.launch(PrimaryWindow.class);
    }

    private static void initStorage() throws FileNotFoundException {
        Controller.createGame();
    }
}
