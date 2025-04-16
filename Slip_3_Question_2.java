// .Define a class MyNumber having one private integer data member. Write a default 
// constructor initialize it to 0 and another constructor to initialize it to a value. Write 
// methods isNegative, isPositive, isOdd, isEven. Use command line argument to 
// pass a value to the object and perform the above tests.



class myNumber  {
    private int num;

    myNumber()
    {
        num = 0;
    }
    myNumber(int value)
    {
        num = value;
    }

    boolean isNegative()
    {
        return num < 0;
    }

    boolean isPositive()
    {
        return num > 0;
    }
    
    boolean isOdd()
    {
        return num % 2 != 0;
    }

    boolean isEven()
    {
        return num % 2 == 0;
    }


    void DisplayInfo()
    {
        System.out.println("Number " + num);
        System.out.println("positive " + isPositive());
        System.out.println("negative " + isNegative());
        System.out.println("Odd " + isOdd());
        System.out.println("Even " +isEven() );
    }
}


public class Slip_3_Question_2 {

    public static void main(String[] args) {
        if (args.length == 0)
        {
            System.out.println("Plese pass an integer value to an command line argument"); 
            return;   
        }

        try 
        {
            int value =Integer.parseInt(args[0]);
            myNumber myNum = new myNumber(value);
            myNum.DisplayInfo();
        } catch (NumberFormatException e) 
        {
            System.out.println("invalid Input Plese Enter Integer value");
        }

    }
    
}