// Write a java program to find the sum of natural numbers up to n. take n as input from the user


import java.util.Scanner;

public class Slip_6_Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter a Positive Number : ");
        int n = sc.nextInt();

        if (n <= 0) 
        {
            System.out.println("Plese Enter Positive Number : ");    

        }
        else
        {
            int sum = 0;
            for (int i = 0; i < n; i++) 
            {
                sum += i;

            }

            System.out.println("Sum of Natural Numbers :" + sum);

        }
    }
}
