// Write a java program to accept details of n customers(c_id, c_name, address,  mobile_no)/
//  from user and store them in a file (Use DataOutputStream class).  Display the details of customers by reading them from file. (Use DataInputStream class). 


import java.io.*;
import java.util.Scanner;


public class Slip_4_Question_2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String fileName = "coustomer.txt";



        try 
        {
            // Write a coustomer Details to a file

            DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));
            
            System.out.println("Number of Coustomers : ");
            int n = sc.nextInt();

            sc.nextLine();



            for (int i = 0; i < n; i++) 
            {
                System.out.println("Enter Details Of Coustomers : "  + (n = 1) + " : ");
                
                
                System.out.println("Coutomer ID");
                int c_id = sc.nextInt();
                sc.nextLine();


                System.out.println("Coustomer Name : ");
                String c_name = sc.nextLine();


                System.out.println("Enter Address : ");
                String c_address = sc.nextLine();


                System.out.println("Enter Mobile : ");
                String c_mobile = sc.nextLine();




                // Writing Data To A file

                dos.writeInt(c_id);
                dos.writeUTF(c_name);
                dos.writeUTF(c_address);
                dos.writeUTF(c_mobile);

            }

            dos.close();
            System.out.println("Coustomer Details Saved To File : ");
        } 
        catch (IOException e) 
        {
            System.out.println("Error Writing to a file : ");
        }




        try 
        {
            DataInputStream dis =  new DataInputStream(new FileInputStream(fileName));



            int count = 1;
            while (dis.available() > 0) 
            {
                int c_id = dis.readInt();
                String c_name = dis.readUTF();
                String c_address = dis.readUTF();
                String c_mobile = dis.readUTF();
                
                

                System.out.println(" Coustomer   : " + count++);
                System.out.println(" ID : " + c_id);
                System.out.println(" Coustomer Name : " + c_name);
                System.out.println(" Coustomer Address : " + c_address);
                System.out.println(" Coustomer Mobile : " + c_mobile );

            }

            dis.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading from file: " + e);
        }

        sc.close();
    }
}
