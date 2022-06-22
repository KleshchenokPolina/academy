package by.academy.homework1;

import java.util.Scanner;
public class Task3 {
    public static void main (String [] arg){
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter number between 1 and 10:");
        int theNumber;
        theNumber  = scan.nextInt();
        int a =theNumber *1;
        int b=theNumber *2;
        int c=theNumber *3;
        int d=theNumber *4;
        int e=theNumber *5;
        int f=theNumber *6;
        int g=theNumber *7;
        int h=theNumber *8;
        int i=theNumber *9;
        int j=theNumber *10;
        System.out.println(theNumber + "*1 = " + a);
        System.out.println(theNumber + "*2 = " + b);
        System.out.println(theNumber + "*3 = " + c);
        System.out.println(theNumber + "*4 = " + d);
        System.out.println(theNumber + "*5 = " + e);
        System.out.println(theNumber + "*6 = " + f);
        System.out.println(theNumber + "*7 = " + g);
        System.out.println(theNumber + "*8 = " + h);
        System.out.println(theNumber + "*9 = " + i);
        System.out.println(theNumber + "*10 = " + j);
        scan.close();
    }
}

