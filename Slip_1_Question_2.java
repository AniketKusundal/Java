import java.io.*;
import series.fiboo;
import series.cube;
import series.square;

public class Slip_1_Question_2 {
    public static void main(String[] args) {
        try {
            BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a Number: ");
            int num  =  Integer.parseInt(br.readLine());

            // Creating Object of the Classes in Series package
            fiboo fib = new fiboo();
            square square = new square();
            cube cube = new cube();

            fib.printSeries(num);
            square.printSeries(num);
            cube.printSeries(num);
            
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
