// k. Pattern:
// EDCBA
// EDCB
// EDC
// ED
// E

public class PatternK {
    public static void main(String[] args) {
        char ch = 'E';
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch--;
            }
            ch = 'E';
            System.out.println();
        }
    }
}
