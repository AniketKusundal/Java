// Write a program to accept 'n' different numbers from the user and store them in an 
// array. Print the sum of elements of the array.

import java.util.Scanner;

public class Slip_7_Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Elements : ");
        int n = sc.nextInt();


        int[]  numbers = new int[n];
        int sum = 0;

        System.out.println("Enter " + n +  "Numbers");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];


        }

        System.out.println("Array Elements : ");
        for (int num : numbers) {
            System.out.println(num + " ");

        }

        // print sum
        System.out.println("Sum of Array : " + sum);


        sc.close();

    }
}
