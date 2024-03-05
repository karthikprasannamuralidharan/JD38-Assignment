// 58. Write a program to input month number and print month Name.

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int monthNumber = sc.nextInt();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Month name for month number " + monthNumber + " is " + months[monthNumber - 1]);
        } else {
            System.out.println("Invalid month number.");
        }
        sc.close();
    }
}

// Output:

// Enter month number (1-12): 10
// Month name for month number 10 is October