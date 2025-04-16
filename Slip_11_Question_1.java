// Write a java program to read the ages of all members of a family, store them in a 
// one dimensional array and display the age of the eldest and the youngest persons. 



import java.util.Scanner;



public class Slip_11_Question_1 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter Number Of Family Member : ");
            int n =  sc.nextInt();

            int[] ages = new int[n];


            // input ages
            for (int i = 0; i < n; i++) 
            {
                System.out.println("Enter a Ages of Member : "  + (i + 1));
                ages[i] = sc.nextInt();

            }


            int eldest = ages[0];
            int youngest = ages[0];

            for (int i = 0; i < n; i++) {
                if (ages[i] > eldest) {
                    eldest = ages[i];
                }
                if (ages[i] < youngest) {
                    youngest = ages[i];
                }
            }


            System.out.println("Elder Member : " + eldest);
            System.out.println("Youngest : " + youngest);
        }
}