// 23. Write a program to find the factorial value of any number.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);

        sc.close();
    }

    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

// Output:

// Enter a number: 6
// Factorial of 6 is: 720
