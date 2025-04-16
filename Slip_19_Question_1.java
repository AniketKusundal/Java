import java.util.Scanner;

public class Slip_19_Question_1 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of family members
        System.out.print("Enter the number of family members: ");
        int numMembers = scanner.nextInt();

        // Create an array to store ages
        int[] ages = new int[numMembers];

        // Read the ages of family members
        System.out.println("Enter the ages of the family members:");
        for (int i = 0; i < numMembers; i++) {
            System.out.print("Age of member " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Initialize the eldest and youngest to the first age in the array
        int eldest = ages[0];
        int youngest = ages[0];

        // Loop through the array to find the eldest and youngest
        for (int i = 1; i < numMembers; i++) {
            if (ages[i] > eldest) {
                eldest = ages[i];
            }
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
        }

        // Display the eldest and youngest ages
        System.out.println("The eldest family member is " + eldest + " years old.");
        System.out.println("The youngest family member is " + youngest + " years old.");

        // Close the scanner
        scanner.close();
    }
}
