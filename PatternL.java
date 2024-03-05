// l. Pattern:
// 10101
// 01010
// 10101
// 01010
// 10101

public class PatternL {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }
    }
}
