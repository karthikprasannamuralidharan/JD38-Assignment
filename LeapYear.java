// 52. Write a program to check whether a year is leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}

// Output:

// Enter a number: 2024
// 2024 is a leap year.

// Enter a number: 2000
// 2000 is a leap year.

// Enter a number: 2100
// 2100 is not a leap year.