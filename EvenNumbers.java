// 17. Write a program to print all even numbers between 1 to 100.

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 to 100:");
        printEvenNumbers();
    }

    public static void printEvenNumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

// Output:
// Even numbers between 1 to 100:
// 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 
