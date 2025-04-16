// Write a java program create class as MyDate with dd,mm,yy as data members. 
// Write default and parameterized constructor. Display the date in dd-mm-yy format. 
// (Use this keyword).



class MyDate{
    private int dd ,  mm , yy;



    MyDate(){
        this.dd = 1;
        this.mm = 10;
        this.yy = 2003;
    }

    MyDate(int dd , int mm , int yy)
    {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void DisplayDate()
    {
        System.out.println("Date : " + this.dd + "-" + this.mm + "-" + this.yy);
    }
}

public class Slip_5_Question_2 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        date1.DisplayDate();



        MyDate date2 = new MyDate();
        date2.DisplayDate();

    }
}
