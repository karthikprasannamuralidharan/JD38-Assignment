// 14. Write a program to print reverse tables.

public class ReverseTables {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Reverse multiplication table for " + n + ":");
        printReverseMultiplicationTable(n);
    }

    public static void printReverseMultiplicationTable(int n) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

// Output:

// Reverse multiplication table for 5:
// 5 x 10 = 50
// 5 x 9 = 45
// 5 x 8 = 40
// 5 x 7 = 35
// 5 x 6 = 30
// 5 x 5 = 25
// 5 x 4 = 20
// 5 x 3 = 15
// 5 x 2 = 10
// 5 x 1 = 5