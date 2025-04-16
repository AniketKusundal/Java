import java.io.*;;


public class Slip_1_Question_1 {

    public static void main(String[] args) {


        try 
        {
            
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter A Number : ");
            
            int num = Integer.parseInt(br.readLine());
            
            System.out.println("Multiplication Number for  :"  + num + " ");
            for (int i = 1; i <= 10; i++) 
            {
                System.out.println(num + " X " + i + " = "  + (num * i));                
            }
        } 
        catch (IOException e) 
        {
            System.err.println("Error Reading Input : " + e);       
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Input Format : " + e);
        }
    }
}