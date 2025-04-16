public class Slip_17_Question_1 {
    public static void main(String[] args) {
        // Check if the command-line argument is passed
        if (args.length != 1) {
            System.out.println("Usage: java Slip_17_Question_1 <number>");
            return;
        }

        try {
            // Parse the number from the command-line argument
            int number = Integer.parseInt(args[0]);

            // Variable to store the reversed number
            int reversedNumber = 0;

            // Loop to reverse the number
            while (number != 0) {
                int digit = number % 10; // Extract the last digit
                reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
                number = number / 10; // Remove the last digit
            }

            // Display the reversed number
            System.out.println("Reversed Number: " + reversedNumber);
        } catch (NumberFormatException e) {
            // Handle invalid number format
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
