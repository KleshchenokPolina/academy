package by.academy.classwork.lesson3;
import java.util.Scanner;
public class Task0 {
    public static void  main (String[] arg){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter string:");
        String month = sc.next();


        month = month.toLowerCase();
        switch (month){
            case "январь":
                System.out.println("1 month");
                break;
            case "февраль" :
                System.out.println("2 month");
                break;
            case "март":
                System.out.println("3 month");
                break;
            case "апрель":
                System.out.println("4 month");
                break;
            case "май":
                System.out.println("5 month");
                break;
            case "июнь":
                System.out.println("6 month");
                break;




            default:
                System.out.println("Это не месяц");

        }
        sc.close();
    }
}
