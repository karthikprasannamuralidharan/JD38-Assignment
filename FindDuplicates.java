// 7. Write a program to find duplicate elements in an array.

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 5, 5};
        
        System.out.print("Duplicate elements in the array: ");
        findDuplicates(array);
    }
    
    public static void findDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
    }
}

// Output:

// Duplicate elements in the array: 3 5 