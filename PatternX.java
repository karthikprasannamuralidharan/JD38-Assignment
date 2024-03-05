// Pattern:
//     *
//    **
//   ***
//  ****
// *****

public class PatternX {
    public static void main(String[] args) {
        int rowCount = 5;
        
        for (int i = 1; i <= rowCount; i++) {
            // Print spaces
            for (int j = rowCount - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
