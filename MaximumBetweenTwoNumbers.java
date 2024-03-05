// 47. Write a program to find maximum between two numbers.

public class MaximumBetweenTwoNumbers {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        System.out.println("Maximum between " + num1 + " and " + num2 + " is: " + max);
    }
}

// Output:

// Maximum between 10 and 20 is: 20