package SparseArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by found on 29-Apr-17.
 */
public class SparseArray {

    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;

    public SparseArray() {
        entries = new ArrayList<SparseArrayEntry>();
    }

    public int getNumRows() {
        return numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public int getValueAt(int row, int col) {
        for (SparseArrayEntry x : entries) {
            if (x.getRow() == row && x.getCol() == col) {
                return x.getValue();
            }
        }
        return 0;
    }

    public void removeColumn(int col){
        for (SparseArrayEntry x : entries) {
            if (x.getCol() == col) {
                entries.remove(x);
            }
        }
        for (SparseArrayEntry x : entries) {
            if (x.getCol() > col) {

            }
        }
    }

}
