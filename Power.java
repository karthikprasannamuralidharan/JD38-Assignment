// 24. Write a program to find the value of one number raised to the power of another.

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        long result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    public static long calculatePower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}

// Output:

// 2 raised to the power of 3 is: 8