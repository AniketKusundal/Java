// Q2. Create a package named 
// Series having three different classes to print series:
// a. Fibonacci series (Marks 12) 
// b. Cube of numbers 
// c. Square of numbers



import java.util.Scanner;

import Seri.*;

public class Slip_7_Question_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Number Of Terms : ");
        int n = sc.nextInt();

        Fibonachi fib = new Fibonachi();
        Cube cube = new Cube();
        Square square = new Square();



        fib.printSeries(n);
        cube.printSeries(n);
        square.printSeries(n);


        sc.close();
    }
}
