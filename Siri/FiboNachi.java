package Siri;

public class FiboNachi {
    public void PrintSeries(int n)
    {
        int a = 0 , b = 1; 
        System.out.println("Fibonachi Serires....");
        for (int i = 0; i < n; i++) 
        {
            System.out.println(a + " ");
            
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}
