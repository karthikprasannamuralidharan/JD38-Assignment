// Pattern:
//     ABA
//    ABCBA
//   ABCDCBA
//  ABCDEDCBA
// ABCDEFEDCBA

public class PatternZ {
    public static void main(String[] args) {
        int rowCount = 5;
        
        for (int i = 0; i < rowCount; i++) {
            
            for (int j = rowCount - i; j > 1; j--) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j));
            }
            
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
