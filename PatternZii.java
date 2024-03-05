// p. Pattern:
// *****
// * * *
// *****
// * * *
// *****

public class PatternZii {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                // Print "*" only at the beginning and end of each row, and at the first and last column
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("* ");
                } else {
                    // Print spaces for other positions
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
