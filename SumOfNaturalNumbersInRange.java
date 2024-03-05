// 19. Write a program to find sum of all natural numbers between 1 to n.

public class SumOfNaturalNumbersInRange {
    static int sum = 0;
    public static void main(String[] args) {
        int n = 10; 
        sum = calculateSum(n);
        System.out.println("Sum of all natural numbers between 1 to " + n + " is: " + sum);
    }

    public static int calculateSum(int n) {
        
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
}

// Output:

// Sum of all natural numbers between 1 to 10 is: 55