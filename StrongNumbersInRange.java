// 34. Write a program to print All Strong numbers 1 to 100000.
// A strong number (also known as a strong, or factorial number) is a number in which the sum of the factorials of its digits is equal to the number itself.
// For example, 145 is a strong number because: 1!+4!+5!=1+24+120=145

public class StrongNumbersInRange {
    public static void main(String[] args) {
        System.out.println("Strong numbers between 1 and 100000:");
        printStrongNumbers();
    }

    public static void printStrongNumbers() {
        for (int i = 1; i <= 100000; i++) {
            if (isStrongNumber(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

// Output:

// Strong numbers between 1 and 100000:
// 1 2 145 40585