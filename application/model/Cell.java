package application.model;

public class Cell {
    String value = "*";
    boolean isFixed = false;

    int row;
    int column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public String getValue() {
        return value;
    }

    public void setDefault() {
        value = "*";
    }
    public void setValue(int value) {
        this.value = String.valueOf(value);
    }

    public void setValuePredefined() {
    }

    public void setValuePredefined(int value) {
        this.value = String.valueOf(value);
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
        return value;
    }
}
