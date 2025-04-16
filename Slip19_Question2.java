class MyNumber {
    private int number;

    // Default constructor
    public MyNumber() {
        number = 0;
    }

    // Parameterized constructor
    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isNegative() {
        return number < 0;
    }

    public boolean isPositive() {
        return number > 0;
    }

    public boolean isOdd() {
        return number % 2 != 0;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public void displayProperties() {
        System.out.println("Number: " + number);
        System.out.println("Is Positive? " + isPositive());
        System.out.println("Is Negative? " + isNegative());
        System.out.println("Is Even? " + isEven());
        System.out.println("Is Odd? " + isOdd());
    }
}

public class Slip19_Question2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        try {
            int value = Integer.parseInt(args[0]);

            MyNumber obj = new MyNumber(value);
            obj.displayProperties();

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter an integer.");
        }
    }
}
