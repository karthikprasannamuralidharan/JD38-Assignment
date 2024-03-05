// 57. Write a program to input week number and print week day.

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter week number (1-7): ");
        int weekNumber = sc.nextInt();
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        if (weekNumber >= 1 && weekNumber <= 7) {
            System.out.println("Week day for week number " + weekNumber + " is " + days[weekNumber - 1]);
        } else {
            System.out.println("Invalid week number.");
        }
        sc.close();
    }
}

// Output:

// Enter week number (1-7): 5
// Week day for week number 5 is Thursday