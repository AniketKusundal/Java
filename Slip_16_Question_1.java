import java.io.*;

public class Slip_16_Question_1 {
    public static void main(String[] args) {
        // Creating a BufferedReader object to read input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Prompt the user for input
            System.out.print("Enter a number to generate its multiplication table: ");
            
            // Read the input as a string and convert it to an integer
            int number = Integer.parseInt(reader.readLine());

            // Generate and display the multiplication table
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}
