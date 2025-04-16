 import java.util.Scanner;

public class Slip_14_Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);

        System.out.println("Binary representation: " + binary);
    }
}
