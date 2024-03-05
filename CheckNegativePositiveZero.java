// 49. Write a program to check whether a number is negative, positive, or zero.

import java.util.Scanner;

public class CheckNegativePositiveZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero.");
        }
        sc.close();
    }
}

// Output:

// Enter a number: 5
// 5 is a positive number.
 
// Enter a number: -5
// -5 is a negative number.
 
// Enter a number: 0
// 0 is zero.