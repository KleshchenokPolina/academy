package by.academy.homework1;
import java.util.Scanner;
public class Task4 {
    public static void main (String [] arg){
        Scanner scan=new Scanner (System.in);
        System.out.println ("Enter the power of two: ");//не уверена, что на математическом английском это звучит так
        int thePower;
        thePower=scan.nextInt();
        int x = 2;
        System.out.println((int)Math.pow(x, thePower));
        if (Math.pow(x, thePower)>1000000){
            System.out.println("Well done!");
        }else
            System.out.println("The power is low.");
        scan.close();
    }
}
