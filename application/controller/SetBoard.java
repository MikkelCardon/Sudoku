package application.controller;

import application.model.Cell;
import storage.Storage;

import java.util.ArrayList;

public class SetBoard {
    public static void setPredefined(){
        // ROW 0
        ArrayList<Cell> row0 = Storage.getRows().get(0);
        row0.get(0).setValuePredefined(); row0.get(1).setValuePredefined(); row0.get(2).setValuePredefined();
        row0.get(3).setValuePredefined(3); row0.get(4).setValuePredefined(1); row0.get(5).setValuePredefined(2);
        row0.get(6).setValuePredefined(4); row0.get(7).setValuePredefined(); row0.get(8).setValuePredefined();

// ROW 1
        ArrayList<Cell> row1 = Storage.getRows().get(1);
        row1.get(0).setValuePredefined(2); row1.get(1).setValuePredefined(); row1.get(2).setValuePredefined(9);
        row1.get(3).setValuePredefined(6); row1.get(4).setValuePredefined(7); row1.get(5).setValuePredefined(4);
        row1.get(6).setValuePredefined(); row1.get(7).setValuePredefined(); row1.get(8).setValuePredefined(8);

// ROW 2
        ArrayList<Cell> row2 = Storage.getRows().get(2);
        row2.get(0).setValuePredefined(7); row2.get(1).setValuePredefined(3); row2.get(2).setValuePredefined();
        row2.get(3).setValuePredefined(9); row2.get(4).setValuePredefined(); row2.get(5).setValuePredefined();
        row2.get(6).setValuePredefined(1); row2.get(7).setValuePredefined(); row2.get(8).setValuePredefined();

// ROW 3
        ArrayList<Cell> row3 = Storage.getRows().get(3);
        row3.get(0).setValuePredefined(9); row3.get(1).setValuePredefined(2); row3.get(2).setValuePredefined();
        row3.get(3).setValuePredefined(7); row3.get(4).setValuePredefined(8); row3.get(5).setValuePredefined(1);
        row3.get(6).setValuePredefined(); row3.get(7).setValuePredefined(); row3.get(8).setValuePredefined();

// ROW 4
        ArrayList<Cell> row4 = Storage.getRows().get(4);
        row4.get(0).setValuePredefined(8); row4.get(1).setValuePredefined(); row4.get(2).setValuePredefined();
        row4.get(3).setValuePredefined(); row4.get(4).setValuePredefined(); row4.get(5).setValuePredefined();
        row4.get(6).setValuePredefined(); row4.get(7).setValuePredefined(2); row4.get(8).setValuePredefined();

// ROW 5
        ArrayList<Cell> row5 = Storage.getRows().get(5);
        row5.get(0).setValuePredefined(4); row5.get(1).setValuePredefined(); row5.get(2).setValuePredefined();
        row5.get(3).setValuePredefined(5); row5.get(4).setValuePredefined(2); row5.get(5).setValuePredefined(6);
        row5.get(6).setValuePredefined(8); row5.get(7).setValuePredefined(9); row5.get(8).setValuePredefined(1);

// ROW 6
        ArrayList<Cell> row6 = Storage.getRows().get(6);
        row6.get(0).setValuePredefined(); row6.get(1).setValuePredefined(6); row6.get(2).setValuePredefined(8);
        row6.get(3).setValuePredefined(); row6.get(4).setValuePredefined(); row6.get(5).setValuePredefined();
        row6.get(6).setValuePredefined(); row6.get(7).setValuePredefined(); row6.get(8).setValuePredefined(3);

// ROW 7
        ArrayList<Cell> row7 = Storage.getRows().get(7);
        row7.get(0).setValuePredefined(); row7.get(1).setValuePredefined(); row7.get(2).setValuePredefined();
        row7.get(3).setValuePredefined(); row7.get(4).setValuePredefined(9); row7.get(5).setValuePredefined();
        row7.get(6).setValuePredefined(6); row7.get(7).setValuePredefined(8); row7.get(8).setValuePredefined();

// ROW 8
        ArrayList<Cell> row8 = Storage.getRows().get(8);
        row8.get(0).setValuePredefined(); row8.get(1).setValuePredefined(); row8.get(2).setValuePredefined(7);
        row8.get(3).setValuePredefined(); row8.get(4).setValuePredefined(); row8.get(5).setValuePredefined();
        row8.get(6).setValuePredefined(2); row8.get(7).setValuePredefined(5); row8.get(8).setValuePredefined(4);




    }
}
