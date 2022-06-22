package by.academy.classwork.lesson4;
import java.util.Scanner;
    public class Task3 {
        public static void main(String[] args) {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Enter N ");
            int n;
            n = scan1.nextInt();
            int sum = 0;
            int i = 0;
            while (i <= n) {
                {
                    sum += i;
                }
                i++;
            }
            System.out.println(sum);


        }
    }
