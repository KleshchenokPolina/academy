package by.academy.classwork.lesson4;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter N ");
        int n;
        n = scan1.nextInt();


        for (int i = 0; i <= n; i++) {

            System.out.println("Your number " + i);

        }scan1.close();
    }
}
