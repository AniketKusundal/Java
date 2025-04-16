import java.util.Scanner;


class Employee {
    String name;
    double Salary;



    // constructor to initalize Employe Details
        Employee(String name , double Salary)
        {
            this.name = name;
            this.Salary = Salary;

        }

        void display()
        {
            System.out.println(" Name " + name + " Salary " + Salary);

        }
}

public class Slip_2_Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee []  employees = new Employee[5];



        for(int i = 0; i < employees.length; i++)
        {
            System.out.println("Enter Name Of Employee " + (i + 1) + " : ");
            String name = sc.nextLine();



            System.out.println("Enter Salary Of Employee " + (i + 1) + " : ");
            double Salary = sc.nextDouble();
            sc.nextLine();


            employees[i] = new Employee(name, Salary);

        }

        for(Employee emp : employees)
        {
            emp.display();
        }

        sc.close();
    }
}
