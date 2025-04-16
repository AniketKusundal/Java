import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Slip_17_Question_2 {

    private static final String FILE_NAME = "number.txt";
    private static int[] numbers = new int[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Load - Generate 10 random integers");
            System.out.println("2. Save - Save numbers to a file");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loadNumbers();
                    break;
                case 2:
                    saveNumbers();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    // Load operation: Generate 10 random 2-digit integers and display them
    private static void loadNumbers() {
        Random random = new Random();
        System.out.println("Generated numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(90) + 10;  // Generate random 2-digit number (between 10 and 99)
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // Save operation: Save the numbers to "number.txt"
    private static void saveNumbers() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (int number : numbers) {
                writer.write(number + "\n");
            }
            System.out.println("Numbers saved to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the numbers: " + e.getMessage());
        }
    }
}
