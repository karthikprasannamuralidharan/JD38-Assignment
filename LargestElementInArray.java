// 5. Write a program to find the largest element in an array.

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 3};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Largest element in the array: " + max);
    }
}

// Output:

// Largest element in the array: 9