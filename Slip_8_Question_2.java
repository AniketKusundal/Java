// Write a java program to accept Doctor’s name from the user and check whether it 
// is valid or not. (It should not contain digits and special symbol) If it is not valid 
// then throw user defined Exception -Name is Invalid –otherwise display it.


import java.util.Scanner;



class InvalidNameException extends Exception
{
    public InvalidNameException(String message){
        super(message);
    }
}

public class Slip_8_Question_2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Doctors's Name : ");
        String doctorName = sc.nextLine();

        try
        {
            if (!doctorName.matches("[a-zA-Z]+")) {
                throw new InvalidNameException(" Enter Valid Name : ");
            }
            else
            {
                System.out.println("Doctor Name is Valid : " + doctorName);
            }

        }
        catch(InvalidNameException e)
        {
            System.out.println("Exception :" + e.getMessage());
        }
    }
}
