import java.io.*;

public class Slip_20_Question_1 {
    public static void main(String[] args) {
        try {
            // Create BufferedReader to accept input from command prompt
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a number to generate its multiplication table: ");
            int num = Integer.parseInt(br.readLine());

            System.out.println("\nMultiplication Table of " + num + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}
