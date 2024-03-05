// 18. Write a program to print all odd numbers between 1 to 100.

public class OddNumbers {
    public static void main(String[] args) {
        System.out.println("Odd numbers between 1 to 100:");
        printOddNumbers();
    }

    public static void printOddNumbers() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
