// 15. Write a program to print all alphabets from a to z.

public class AlphabetsFromAToZ {
    public static void main(String[] args) {
        System.out.println("Alphabets from a to z:");
        printAlphabetsFromAToZ();
    }

    public static void printAlphabetsFromAToZ() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}

// Output:
// Alphabets from a to z:
// a b c d e f g h i j k l m n o p q r s t u v w x y z 