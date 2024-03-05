// n. Pattern:
// 54321
// 4321
// 321
// 21
// 1

public class PatternN {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i + 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
