// 30. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);

        sc.close();
    }
}

// Output:

// Enter the number of elements: 5
// Enter number 1: 5
// Enter number 2: 2
// Enter number 3: 9
// Enter number 4: 1
// Enter number 5: 3
// Largest number: 9
// Smallest number: 1