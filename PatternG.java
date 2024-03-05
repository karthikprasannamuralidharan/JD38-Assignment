// g. Pattern:
// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE

public class PatternG {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (char ch = 'A'; ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
