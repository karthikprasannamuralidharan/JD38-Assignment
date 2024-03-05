// 25. Write a program to reverse the given digits.

public class ReverseDigits {
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseDigits(number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseDigits(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }
}

// Output:

// Reversed number: 54321
