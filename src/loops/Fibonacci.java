package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term upto which you want fibo");

        int n = sc.nextInt(), a = 0, b = 1;

        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 0; i < n-2; i++){// becoz 2 terms are already printed
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }



    }
}
