// 48. Write a program to find maximum between three numbers.

public class MaximumBetweenThreeNumbers {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15;

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Maximum between " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);
    }
}

// Output:

// Maximum between 10, 20, and 15 is: 20