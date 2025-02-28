package application.controller;

import application.model.Cell;
import storage.Storage;

import java.util.ArrayList;

public class SetBoard {
    public static void setPredefined(){

        int[] board = {
                0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0,
        };

        ArrayList<Cell> cell = Storage.getAllCells();

        for (int i = 0; i < board.length; i++) {
            cell.get(i).setValuePredefined(board[i]);
        }

    }
}
