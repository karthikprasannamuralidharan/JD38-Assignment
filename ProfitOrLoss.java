// 62. Write a program to calculate profit or loss.

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit: " + profit);
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss: " + loss);
        } else {
            System.out.println("No profit or loss.");
        }
        sc.close();
    }
}

// Output:

// Enter cost price: 10000
// Enter selling price: 12000
// Profit: 2000.0