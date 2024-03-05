// 10. Write a program that finds the common elements between two arrays and prints them.

public class CommonElementsInArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        
        System.out.print("Common elements between array1 and array2: ");
        findCommonElements(array1, array2);
    }
    
    public static void findCommonElements(int[] array1, int[] array2) {
        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                    break;
                }
            }
        }
    }
}

// Output:

// Common elements between array1 and array2: 4 5 