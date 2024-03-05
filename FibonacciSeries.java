// 33. Write a program to print Fibonacci series up to n terms.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFibonacciSeries(n);

        sc.close();
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}

// Output:

// Enter a number: 20
// Fibonacci series up to 20 terms:
// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181