// 1. Create a simple calculator program that takes two numbers and an operator (+, -, *) as input. Perform the corresponding operation and display the result. If an invalid operator is entered, print an error message.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
        double result = 0;
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error! Invalid operator.");
                
        }
        System.out.println("Result: " + result);

        sc.close();
    }
}

// Output:

// Enter first number: 3
// Enter second number: 2
// Enter operator (+, -, *, /): +
// Result: 5.0

// Enter first number: 2
// Enter second number: 3
// Enter operator (+, -, *, /): -
// Result: -1.0

// Enter first number: 2
// Enter second number: 3
// Enter operator (+, -, *, /): *
// Result: 6.0

// Enter first number: 6
// Enter second number: 2
// Enter operator (+, -, *, /): /
// Result: 3.0