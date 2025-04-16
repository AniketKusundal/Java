import java.util.Arrays;

public class Slip_13_Question1 {
    public static void main(String[] args) {
        // Check if exactly 3 arguments are passed
        if (args.length != 3) {
            System.out.println("Please enter exactly 3 numbers.");
            return;
        }

        try {
            // Convert command line arguments to integers
            int[] numbers = new int[3];
            for (int i = 0; i < 3; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            // Sort the array
            Arrays.sort(numbers);

            // Display sorted numbers
            System.out.println("Sorted numbers:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integer numbers only.");
        }
    }
}
