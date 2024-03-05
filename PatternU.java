// Pattern:
//    1
//   121
//  12321
// 1234321
//123454321

public class PatternU {
    public static void main(String[] args) {
        int rowCount = 5;
        
        for (int i = 0; i < rowCount; i++) {
            
            for (int j = rowCount - i; j > 1; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
