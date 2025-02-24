package application.model;

public class Cell {
    int value = 0;
    boolean isFixed = false;

    int row;
    int column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getValue() {
        return value;
    }

    public void setDefault() {
        value = 0;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public void setValuePredefined() {
    }

    public void setValuePredefined(int value) {
        this.value = value;
        isFixed = true;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
