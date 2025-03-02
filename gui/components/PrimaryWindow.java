package gui.components;


import application.model.Cell;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import storage.Storage;

import java.util.ArrayList;

public class PrimaryWindow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TITEL");
        GridPane pane = new GridPane();
        initContent(pane);
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    ArrayList<Label> cells = new ArrayList<>();

    private void initContent(GridPane pane) {
        pane.setHgap(10);
        pane.setVgap(10);

        for (Cell cell : Storage.getAllCells()) {
            Label cellLable = new Label(String.valueOf(cell.getValue()));
            pane.add(cellLable, cell.getRow(), cell.getColumn());
            cells.add(cellLable);
        }
    }
    private void updateLabels(int index){

    }
}

