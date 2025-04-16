// . Write a Java program to accept two numbers and find out the addition, 
// multiplication, subtraction, division and remainder after division.



import java.util.Scanner;

public class Slip_15_Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept two numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Perform operations
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;

        // Division and remainder with check for divide-by-zero
        if (num2 != 0) {
            double division = (double) num1 / num2;
            int remainder = num1 % num2;

            // Display results
            System.out.println("Addition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + division);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Cannot divide by zero!");
        }

        sc.close();
    }
}
