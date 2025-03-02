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
        labelArrayList = PrimaryWindow.getLabelArrayList();

        for (Cell cell : Storage.getAllCells()) {
            String text = String.valueOf(cell.getValue());
            Label label = new Label(text);

            pane.add(label, cell.getColumn(), cell.getRow());
            labelArrayList.add(label);
        }
        setPadding();
    }

    private static void setPadding(){
        ArrayList<Cell> cells = Storage.getAllCells();

        for (int i = 0; i < cells.size(); i++) {
            Cell cell = cells.get(i);
            int top = 5;
            int left = 5;

            if (cell.getRow() % 3 == 0 && cell.getRow() != 0){
                top = 25;
            }
            if (cell.getColumn() % 3 == 0 && cell.getColumn() != 0){
                left = 25;
            }

            String style = "-fx-padding: "+top+"px 5px 5px "+left+"px; -fx-font-weight: bold;";
            labelArrayList.get(i).setStyle(style);
        }

    }

}
