// 3. Write a program to find the sum of elements in an array.

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of elements in the array: " + sum);
    }
}

// Output:

// Sum of elements in the array: 15