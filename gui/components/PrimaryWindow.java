package gui.components;


import application.controller.Controller;
import application.model.Cell;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import storage.Storage;

import java.util.ArrayList;

import static application.controller.Controller.run;


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
    private static ArrayList<Label> labelArrayList = new ArrayList<>();


    private void initContent(GridPane boardPane) {
        boardPane.setHgap(10);
        boardPane.setVgap(10);

        Button runProgram = new Button("RUN");
        runProgram.setOnAction(actionEvent -> run());
        boardPane.add(runProgram, 12, 0);

        Layout.initBoardLayout(boardPane);
    }

    public static void updateLabels(){
        ArrayList<Cell> cells = Storage.getAllCells();

        for (int i = 0; i < labelArrayList.size(); i++) {
            Cell cell = cells.get(i);
            String value = String.valueOf(cell.getValue());

            Label label = labelArrayList.get(i);
            label.setText(value);
            label.setTextFill(getColor(cell));
        }
    }

    private static Color getColor(Cell cell){
        if (cell.isFixed()){
            return Color.BLACK;
        } else return Color.GREEN;
    }

    public static ArrayList<Label> getLabelArrayList() {
        return labelArrayList;
    }
}

