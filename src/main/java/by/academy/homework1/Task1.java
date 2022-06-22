package by.academy.homework1;
import java.util.Scanner;
public class Task1 {
    public static void main (String[]arg){
        Scanner scan=new Scanner (System.in);
        System.out.println ("Enter the amount of purchase: ");
        double theAmount;
        theAmount=scan.nextDouble();

        Scanner scan1=new Scanner (System.in);
        System.out.println ("Enter the buyer's age: ");
        int theAge;
        theAge=scan1.nextInt();

        if (theAmount<100){
            System.out.println ("Final price is "+theAmount*0.95);
        } else if (theAmount>100&&theAmount<200) {
            System.out.println("Final price is "+theAmount*0.93);
        }else if (theAmount>=200&&theAmount<300){
            if (theAge>18){
                System.out.println("Final price is "+theAmount*(0.88-0.04));
            }else {
                System.out.println("Final price is "+theAmount*(0.88+0.03));
            }
        }else if (theAmount>=300&&theAmount<400) {
            System.out.println("Final price is " + theAmount * 0.85);
        }else {
            System.out.println ("Final price is " + theAmount * 0.8);
            scan.close();
            scan1.close();
        }
    }
}

