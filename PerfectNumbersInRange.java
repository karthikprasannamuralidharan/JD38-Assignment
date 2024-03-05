// 35. Write a Program to print All perfect numbers 1 to 10000.
// A perfect number is a positive integer that is equal to the sum of its proper divisors, excluding itself. In other words, a perfect number is a number that is half the sum of all of its positive divisors (including 1 but excluding itself).
// For example, 6 is a perfect number because its divisors are 1, 2, and 3, and 1+2+3=6. Similarly, 28 is a perfect number because its divisors are 1, 2, 4, 7, and 14, and 1+2+4+7+14=28.

public class PerfectNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 10000:");
        printPerfectNumbers();
    }

    public static void printPerfectNumbers() {
        for (int i = 1; i <= 10000; i++) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}

// Output:

// Perfect numbers between 1 and 10000:
// 6 28 496 8128 