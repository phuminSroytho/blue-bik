public class Main {
    public static void main(String[] args) {
        int inputNumRows = 8;

        printPascalTriangle(inputNumRows);
    }

    public static void printPascalTriangle(int numRows) {
        int maxWidth = numRows * 2;

        for (int i = 0; i < numRows; i++) {
            int[] row = generatePascalRow(i);
            int padding = (maxWidth - (row.length * 2)) / 2;
            // Print for space
            for (int p = 0; p < padding; p++) {
                System.out.print(" ");
            }
            // Print for triangle
            for (int k : row) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

    public static int[] generatePascalRow(int rowNum) {
        int[] row = new int[rowNum + 1];
        row[0] = 1;

        for (int i = 1; i <= rowNum; i++) {
            /*
                Formula nextValue = valueInside*((n-k+1)/k)
                n = rowNumber
                k, i = position
             */
            row[i] = row[i - 1] * (rowNum - i + 1) / i;
        }

        return row;
    }

}