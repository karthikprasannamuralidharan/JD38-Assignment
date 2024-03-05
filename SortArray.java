// 4. Write a program to sort an array in ascending order.

import java.util.Arrays;

public class SortArray {
    
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        // Copy elements to left and right arrays
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        
        // Recursively sort the left and right halves
        mergeSort(left);
        mergeSort(right);
        
        // Merge the sorted halves
        merge(arr, left, right);
    }
    
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

// Output:

// Sorted array: [5, 6, 7, 11, 12, 13]