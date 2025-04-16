import java.util.Scanner;

// Abstract class
abstract class Employee {
    abstract void accept();
    abstract void display();
}

// Manager class
class Manager extends Employee {
    int m_id;
    String m_name;
    String phno;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager ID: ");
        m_id = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Manager Name: ");
        m_name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        phno = sc.nextLine();
    }

    public void display() {
        System.out.println("\n--- Manager Details ---");
        System.out.println("ID: " + m_id);
        System.out.println("Name: " + m_name);
        System.out.println("Phone Number: " + phno);
    }
}

// Worker class
class Worker extends Employee {
    String name;
    int workingHours;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Worker Name: ");
        name = sc.nextLine();

        System.out.print("Enter Working Hours: ");
        workingHours = sc.nextInt();
    }

    public void display() {
        System.out.println("\n--- Worker Details ---");
        System.out.println("Name: " + name);
        System.out.println("Working Hours: " + workingHours);
    }
}

// Main class
public class Slip_20_Question_2 {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.accept();
        mgr.display();

        Worker wrk = new Worker();
        wrk.accept();
        wrk.display();
    }
}
