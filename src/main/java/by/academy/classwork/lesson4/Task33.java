package by.academy.classwork.lesson4;

import java.util.Scanner;
public class Task33 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter N ");
        int n;
        n = scan1.nextInt();
        int result=1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
            System.out.println(result);
        }scan1.close();
    }
}


