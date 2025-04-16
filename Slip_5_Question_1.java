// Write a Java program to print the area and perimeter of a circle

import java.util.Scanner;

public class Slip_5_Question_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Radius Of Circule : ");
        double radius = sc.nextDouble();

        // Calculation
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;


        System.out.println("Area Of Circle " + area);
        System.out.println("Area Of Parimeter : " + perimeter);
        
        sc.close();
    }



}
