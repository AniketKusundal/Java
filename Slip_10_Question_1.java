// Write a program to print the factors of a number. Accept a number using a 
// command line argument.


public class Slip_10_Question_1 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Enter a number In command line argument : ");
            return;
        }

        int num = Integer.parseInt(args[0]);

        System.out.println("Factors Of " + num + " are : ");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
