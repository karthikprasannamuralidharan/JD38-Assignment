// 51. Write a program to check whether a number is even or odd.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        sc.close();
    }
}

// Output:

// Enter a number: 11
// 11 is odd.

// Enter a number: 28
// 28 is even.