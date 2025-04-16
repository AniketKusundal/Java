// Write a Java program to find the area of a rectangle and triangle.

import java.util.Scanner;

public class Slip_4_Question_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        // Area of reactangle
        System.out.println("Enter Length : ");
        double length = sc.nextDouble();

        System.out.println("Enter Width : ");
        double width = sc.nextDouble();

        double areaOfReactangle = length * width;
        System.out.println("Area Of reactangle Is : " + areaOfReactangle);




        // Area Of Trangle
        System.out.println("Enter Base : ");
        double base = sc.nextDouble();
        System.out.println("Enter Heigth : ");
        double Heigth = sc.nextDouble();
        System.out.println("Enter Heigth");

        double areaOfTrangle = 0.5 * base * Heigth;
        System.out.println("Area Of Trangle" + areaOfTrangle);



        sc.close();
    }    
}
