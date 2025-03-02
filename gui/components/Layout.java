package gui.components;

import application.model.Cell;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Box;
import storage.Storage;

import java.util.ArrayList;

public class Layout {
    private static ArrayList<Label> labelArrayList;

    public static void initBoardLayout(GridPane pane){
        ArrayList<Label> labelArrayList = PrimaryWindow.getLabelArrayList();


        for (Cell cell : Storage.getAllCells()) {
            String text = String.valueOf(cell.getValue());
            Label label = new Label(text);

            pane.add(label, cell.getColumn(), cell.getRow());
            labelArrayList.add(label);
        }


    }

}
