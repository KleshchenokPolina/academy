package by.academy.homework1;

import java.util.Scanner;
public class Task2{
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the data type: ");
        String theData = scan.next();

        switch (theData) {
            case "int":
                Scanner scan1 = new Scanner(System.in);
                System.out.println("Enter the variable: ");
                int theV1=scan1.nextInt();
                System.out.println(theV1%2);
                scan1.close();
                break;
            case "double":
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Enter the variable: ");
                double theV2=scan2.nextDouble();
                System.out.println(theV2 * 0.7);
                scan2.close();
                break;

            case "float":
                Scanner scan3 = new Scanner (System.in);
                System.out.println("Enter the variable: ");
                float theV3= scan3.nextFloat();
                System.out.println(theV3 * theV3);
                scan3.close();
                break;
            case"char":
                Scanner scan4 = new Scanner (System.in);
                System.out.println("Enter the variable: ");
                char theV4= scan4.next().charAt(0);
                System.out.println(theV4);
                scan4.close();
                break;
            case "String":
                Scanner scan5=new Scanner (System.in);
                System.out.println("Enter the variable: ");
                String theV5=scan5.next();
                System.out.println("Hello, " + theV5+".");
                scan5.close();
                break;
            default:
                System.out.println("Unsupported type.");
        }
        scan.close();
    }
}
