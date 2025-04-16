// Write a java program to reverse a Number. Accept number using command line argument.


public class Slip_2_Question_1 {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int Reverse = 0;
        while (num != 0) {
            Reverse = Reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed Number" + Reverse);
    }
    
}
