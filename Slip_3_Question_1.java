// Write a Java program to print the sum of elements of the array. Also display array  elements in ascending order. 

import java.util.Scanner;
import java.util.Arrays;





public class Slip_3_Question_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Elements : ");
        int n = sc.nextInt();


        int[] arr = new int[n];


        System.out.println("Enter " + n + "Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        //  Calculate sum

        int sum = 0;
        for(int num : arr)
        {
            sum += num;
        }

        Arrays.sort(arr);

        // Display Result
        System.out.println("Sum Of The Array :" + sum);
        System.out.println("Array In Assending Order : " );
        for(int num : arr)
        {
            System.out.println(num + " ");
        }

        sc.close();



    }
}
