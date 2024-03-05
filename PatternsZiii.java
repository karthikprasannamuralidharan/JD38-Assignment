// Pattern:
// *****
// *   *
// *****
// *   *
// *   *
public class PatternsZiii {
    public static void main(String[] args) {
        int rowCount = 5;

        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j <= rowCount; j++) {
                // Print "*" for the first and last row, and the first and last column
                if (i == 1 || i == 3 || j == 1 || j == rowCount) {
                    System.out.print("*");
                } else {
                    // Print space for other positions
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
