public class CS160p1 {

    private int[][] arr;

    public CS160p1(int numRows, int numCols) {
        this.arr = createPatterned2DArray(numRows, numCols);
    }

    private int[][] createPatterned2DArray(int numRows, int numCols) {
        int[][] arr = new int[numRows][numCols];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = 10 + ((i + 1) * numRows) + j;
            }
        }
        return arr;
    }

    public int getRows() {
        return arr.length;
    }

    public int getCols() {
        return arr[0].length;
    }

    public void print2DArray() {
        print2DArray(arr);
    }

    public void print2DArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.printf("%-4d", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void print2DArrayTransposed() {
        print2DArrayTransposed(arr);
    }

    public void print2DArrayTransposed(int[][] a) {
        for (int i = 0; i < getCols(); i++) {
            for (int j = 0; j < getRows(); ++j) {
                System.out.printf("%-4d", a[j][i]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
