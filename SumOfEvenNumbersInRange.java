// 20. Write a program to find sum of all even numbers between 1 to n.

public class SumOfEvenNumbersInRange {
    public static void main(String[] args) {
        int n = 10;
        int sum = calculateSum(n);
        System.out.println("Sum of all even numbers between 1 to " + n + " is: " + sum);
    }

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}

// Output:

// Sum of all even numbers between 1 to 10 is: 30