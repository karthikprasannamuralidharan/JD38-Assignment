// 63. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics, and Computer.
// Calculate percentage and grade according to following:
// Percentage >= 90%: Grade A
// Percentage >= 80%: Grade B
// Percentage >= 70%: Grade C
// Percentage >= 60%: Grade D
// Percentage >= 40%: Grade E
// Percentage < 40%: Grade F

import java.util.Scanner;

public class CalculatePercentageAndGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of five subjects:");
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int biology = sc.nextInt();
        int mathematics = sc.nextInt();
        int computer = sc.nextInt();

        int totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (totalMarks / 500.0) * 100;
        
        System.out.println("Percentage: " + percentage);
        
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

// Output:
// Enter marks of five subjects:
// 90
// 50
// 70
// 95
// 88
// Percentage: 78.60000000000001
// Grade: C
