// .Write a program to accept 'n' different numbers from the user and store it in an 
// array. Display largest number from an array. 


import java.util.Scanner;

public class Slip_12_question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        System.out.println("Enter How Many Number You want to Eneter ");
        int n = sc.nextInt();

        int[] numbers = new int[n];


        System.out.println("Enter :" + n + "Diffrent Numbers");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();

        }



        // find the largest
        int largest = numbers[0];
        for (int i = 0; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }


        System.out.println("The Largest Number Is :" + largest);

        sc.close();
    }
}
