// 64. Write a program to input basic salary of an employee and calculate its Gross salary according to following:
// Basic Salary < 10000: HRA = 20%, DA = 80%
// Basic Salary 10000-20000: HRA = 25%, DA = 90%
// Basic Salary > 20000: HRA = 30%, DA = 95%

import java.util.Scanner;

public class CalculateGrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        double hra, da;
        if (basicSalary < 10000) {
            hra = basicSalary * 0.2;
            da = basicSalary * 0.8;
        } else if (basicSalary >= 10000 && basicSalary <= 20000) {
            hra = basicSalary * 0.25;
            da = basicSalary * 0.9;
        } else {
            hra = basicSalary * 0.3;
            da = basicSalary * 0.95;
        }

        double grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary: " + grossSalary);

        sc.close();
    }
}

// Output:
// Enter basic salary: 8000
// Gross Salary: 16000.0
// Enter basic salary: 15000
// Gross Salary: 32250.0
// Enter basic salary: 50000
// Gross Salary: 112500.0