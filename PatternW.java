// Pattern:
// 123456789
//  1234567
//   12345
//    123
//     1

public class PatternW {
    public static void main(String[] args) {
        int rowCount = 5;
        int numberCount = 9;

        for (int i = 0; i < rowCount; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= numberCount; j++) {
                System.out.print(j);
            }
            System.out.println();
            numberCount -= 2;
        }
    }
}
