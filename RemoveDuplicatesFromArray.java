// 9. Create a Java program to remove duplicate elements from an array and print the modified array.

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArray = removeDuplicates(array);
        System.out.print("Modified array after removing duplicates: ");
        printArray(uniqueArray);
    }
    
    public static int[] removeDuplicates(int[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length;) {
                if (array[i] == array[j]) {
                    for (int k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--;
                } else {
                    j++;
                }
            }
        }
        int[] result = new int[length];
        System.arraycopy(array, 0, result, 0, length);
        return result;
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// Output:

// Modified array after removing duplicates: 1 2 3 4 5 