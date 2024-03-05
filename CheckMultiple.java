// 8. Write a Java program that takes two integers as input and determines whether the first is a multiple of the second. Display the result.

import java.util.Scanner;

public class CheckMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();
        
        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of " + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
        sc.close();
    }
}

// Output:

// Enter first integer: 6
// Enter second integer: 2
// 6 is a multiple of 2

// Enter first integer: 2
// Enter second integer: 6
// 2 is not a multiple of 6

