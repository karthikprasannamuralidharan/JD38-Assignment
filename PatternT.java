// Pattern:
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

public class PatternT {
    public static void main(String[] args) {
        int rowCount = 5;
        int number = 1;

        for (int i = 0; i < rowCount; i++) {
            // Print spaces
            
            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}
