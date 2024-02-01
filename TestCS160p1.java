import java.util.Scanner;

public class TestCS160p1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numRows = scan.nextInt();
        int numCols = scan.nextInt();

        CS160p1 cs160 = new CS160p1(numRows, numCols);

        System.out.println(numRows + " by " + numCols + " matrix");
        System.out.println();
        cs160.print2DArray();
        cs160.print2DArrayTransposed();
    }
}
