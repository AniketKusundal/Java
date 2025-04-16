// Define a class Employee having members-id, name, salary. Define default 
// constructor. Create a subclass called Manager with a private member bonus. Define 
// methods accept and display in both the classes .Create an object of the Manager 
// class and display the details of the Employee having the maximum total 
// salary(salary+bonus). 

import java.util.Scanner;


class Employee{
    int id;
    String name;
    double salary;


    Employee(){
        this.id = 1;
        this.name ="aniket";
        this.salary = 55485;
    }

    void Accept(Scanner sc)
    {
        System.out.println("Enter Employee ID : ");
        id = sc.nextInt();
        sc.nextLine();


        System.out.println("Empoyee Name : ");
        name = sc.nextLine();

        System.out.println("Enter Salary : ");
        salary = sc.nextDouble();

    }

        void display()
        {
            System.out.println("Id : " + id);
            System.out.println("Name : " + name);
            System.out.println("Salary : "+ salary);
        }

}


class Manager extends Employee
{
    private double bonous;


    Manager()
    {
        super();
        this.bonous = 0.0;
    }


    void accept(Scanner sc)
    {
        super.Accept(sc);
        System.out.println("Enter Bonous : ");
        bonous = sc.nextDouble();
    }



    void display()
    {
        super.display();
        System.out.println("Bonous : " + bonous);
        System.out.println("Total Salary (Salary + Bonous ) " + getTotalSalary());
    }

    double getTotalSalary()
    {
        return salary + bonous;
    }
}





public class Slip_6_Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Number of Maneger : ");
        int n = sc.nextInt();


        Manager [] manegers = new Manager[n];

        // Accept
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Details Of Maneger : " + (i + 1));
            manegers[i] = new Manager();
            manegers[i].accept(sc);
        }



        // Find maneger With max Total Salary

        double maxSalary = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; n++) {
            double total = manegers[i].getTotalSalary();
            if (total > maxSalary) 
            {
                maxSalary = total;
                maxIndex = i;    
            }
        }


        System.out.println("Maneger With Total Heights Salary : " );
        manegers[maxIndex].display();

        sc.close();
    }
}
