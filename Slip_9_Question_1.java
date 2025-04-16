// Write a program to accept a number from the user. Check whether the number is 
// prime or not


import java.util.Scanner;

public class Slip_9_Question_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Number : ");
        int number  = sc.nextInt();


        boolean isPrime = true;



        if (number <= 1) {
            isPrime = false;
        }
        else
        {
            for(int i = 2; i <= Math.sqrt(number); i++) 
            {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " : Is Prime : ");
        }
        else
        {
            System.out.println(number + " : is Not Prime");
        }

        sc.close();
    }
}