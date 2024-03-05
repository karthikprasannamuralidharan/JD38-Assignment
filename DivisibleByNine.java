// 31. Write a program to find the number and sum of all integers between 100 and 200 which are divisible by 9.

public class DivisibleByNine {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        System.out.println("Numbers which are divisible by 9 between 100 and 200 are: " );
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                System.out.print(i+" ");
                count++;
                sum += i;
            }
        }

        System.out.println("\nNumber of integers divisible by 9 between 100 and 200: " + count);
        System.out.println("Sum of integers divisible by 9 between 100 and 200: " + sum);
    }
}

// Output:

// Numbers which are divisible by 9 between 100 and 200 are: 
// 108 117 126 135 144 153 162 171 180 189 198 

// Number of integers divisible by 9 between 100 and 200: 11

// Sum of integers divisible by 9 between 100 and 200: 1683