// Pattern:
//    1
//   333
//  55555
// 7777777
//999999999

public class PatternV {
    public static void main(String[] args) {
        int rowCount = 5;
        int number = 1;
        
        for (int i = 1; i <= rowCount; i++) {
            
            for (int j = rowCount; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(number);
            }
            number += 2;
            System.out.println();
        }
    }
}
