// b. Pattern:
// 54321
// 54321
// 54321
// 54321
// 54321

public class PatternB {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
