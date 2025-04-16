public class Slip_16_Question_2 {

    // MyNumber class definition
    static class MyNumber {
        // Private integer data member
        private int number;

        // Default constructor initializing the number to 0
        public MyNumber() {
            this.number = 0;
        }

        // Constructor initializing the number to a specific value
        public MyNumber(int number) {
            this.number = number;
        }

        // Method to check if the number is negative
        public boolean isNegative() {
            return this.number < 0;
        }

        // Method to check if the number is positive
        public boolean isPositive() {
            return this.number > 0;
        }

        // Method to check if the number is odd
        public boolean isOdd() {
            return this.number % 2 != 0;
        }

        // Method to check if the number is even
        public boolean isEven() {
            return this.number % 2 == 0;
        }

        // Getter for number
        public int getNumber() {
            return number;
        }
    }

    public static void main(String[] args) {
        // Check if the number is passed via command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java Slip_16_Question_2 <number>");
            return;
        }

        try {
            // Parse the number from the command-line argument
            int inputNumber = Integer.parseInt(args[0]);

            // Create MyNumber object using the parameterized constructor
            MyNumber myNumber = new MyNumber(inputNumber);

            // Output the results of the checks
            System.out.println("Number: " + myNumber.getNumber());
            System.out.println("Is Negative: " + myNumber.isNegative());
            System.out.println("Is Positive: " + myNumber.isPositive());
            System.out.println("Is Odd: " + myNumber.isOdd());
            System.out.println("Is Even: " + myNumber.isEven());

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
