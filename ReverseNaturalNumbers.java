// 12. Write a program to print all natural numbers in reverse.

public class ReverseNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Natural numbers in reverse from " + n + " to 1:");
        printReverseNaturalNumbers(n);
    }
    
    public static void printReverseNaturalNumbers(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

// Output:

// Natural numbers in reverse from 10 to 1:
// 10 9 8 7 6 5 4 3 2 1