// 21. Write a program to find sum of all odd numbers between 1 to n.

public class SumOfOddNumbersInRange {
    public static void main(String[] args) {
        int n = 10; // Change n to set the upper limit
        int sum = calculateSum(n);
        System.out.println("Sum of all odd numbers between 1 to " + n + " is: " + sum);
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}

// Output:

// Sum of all odd numbers between 1 to 10 is: 25