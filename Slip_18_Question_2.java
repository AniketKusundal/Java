// Write a java program to copy the contents of one file to another file using command line arguments.


import java.io.*;




public class Slip_18_Question_2 {
    public static void main(String[] args) {
        
        if (args.length < 2) 
        {
            System.out.println("Usage : Java File copny Content");
            return;
        }
    
            String sourseFile = args[0];
            String destinationFile = args[1];
        


        try 
        {
            FileInputStream fis = new FileInputStream(sourseFile);
            FileOutputStream fos = new FileOutputStream(destinationFile);



            int ch;
            while ((ch = fis.read()) != -1) 
            {
                fos.write(ch);    
            }

            System.out.println("File Copied");

            fis.close();
            fos.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File Not Found : ");
        }
        catch(IOException e)
        {

            System.out.println("Error While Copying File");
        }
    }
}
