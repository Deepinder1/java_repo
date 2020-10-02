package whileloops;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        System.out.println(" Enter the number" );
        Scanner sc = new Scanner(System.in);
        int n = 1;
        do {
            n = sc.nextInt();
            System.out.println("number " + n);// lopp will atleast work oncen even if value is 0
        }while (n != 0);
    }
}
