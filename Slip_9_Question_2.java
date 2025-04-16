// Define an interface Operation which has methods area(),volume(). Define a 
// constant PI having a value 3.142. Create a class circle(member-radius), cylinder 
// (members - radius, height) which implements this interface. Calculate and 
// display the area and volume. 

interface Operation
{
    double PI = 3.142;



    void area();
    void volume();

}

class circle implements Operation{

    double radius;

    circle(double r)
    {
        radius = r;
    }

    public void  area()
    {
        double area = PI * radius * radius;
        System.out.println("Area Of Circle :" + area);

    }

    public void volume()
    {
        System.out.println("Voulume Of circle not Applicable");

    }
}


class Cylinder implements Operation
{
    double radius ,  height;

    Cylinder(double r , double h)
    {
        radius = r;
        height = h;
    }

    public void area()
    {
        double area = 2 * PI * radius * radius * height;
        System.out.println("Surface Area Of Cylinder : " +  area);
    }

    public void volume ()
    {
        double volume  = PI * radius * radius * height;
        System.out.println("Volume Of Cylinder : " + volume);
    }
    
}





public class Slip_9_Question_2 {
    public static void main(String[] args) {
        circle c = new circle(5);
        c.area();
        c.volume();

        System.out.println();


        Cylinder cy = new Cylinder(4, 10);
        cy.area();
        cy.volume();
    }
}
