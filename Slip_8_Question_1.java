// .Write a program to reverse a number. Accept number using command line 
// argument. 



public class Slip_8_Question_1 {
    public static void main(String[] args) {
        if (args.length == 0) 
        {
            System.out.println("Plese Provide a Number As a command line argument");    
        }
        
            int num = Integer.parseInt(args[0]);
            int Reversed = 0;



            while (num != 0) 
            {
                int digit = num % 10;
                Reversed = Reversed * 10 + digit;
                num = num / 10;   

            }

            System.out.println("Reversed Number : " + Reversed);
        }
    }    

