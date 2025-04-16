
import Siri.*;
import java.util.Scanner;;


public class Slip_11_Question_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Number Of Terms : ");
        int n = sc.nextInt();



        FiboNachi fib = new FiboNachi();
        Cube cube = new Cube();
        Square square = new Square();

        fib.PrintSeries(n);
        cube.PrintSeries(n);
        square.PrintSeries(n);


       
    } 
}
