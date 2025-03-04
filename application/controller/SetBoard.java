package application.controller;

import application.model.Cell;
import storage.Storage;

import java.util.ArrayList;

public class SetBoard {
    public static void setPredefined(){

        int[] board = {
                0, 0, 0, 0, 0, 0, 4, 0, 2,
                6, 0, 0, 7, 0, 0, 0, 1, 0,
                5, 0, 0, 0, 2, 0, 7, 0, 0,
                0, 3, 0, 0, 1, 0, 0, 4, 8,
                0, 4, 0, 2, 0, 0, 0, 0, 0,
                0, 8, 0, 9, 0, 0, 0, 5, 0,
                0, 5, 0, 0, 0, 3, 0, 7, 0,
                0, 0, 0, 0, 0, 0, 0, 0, 0,
                9, 0, 0, 1, 0, 0, 0, 8, 0,
        };

        ArrayList<Cell> cell = Storage.getAllCells();

        for (int i = 0; i < board.length; i++) {
            cell.get(i).setValuePredefined(board[i]);
        }

    }
}
