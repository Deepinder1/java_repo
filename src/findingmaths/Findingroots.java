package findingmaths;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Findingroots {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        double a,b,c,d,x1,x2;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers :");

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        d = (b * b) - (4 * a * c);

        if (d > 0) {
            x1 = (-b - sqrt(d)) / 2 * a;
            x2 = (-b + sqrt(d)) / 2 * a;

            System.out.println("First Root is :" +x1);
            System.out.println("Second Root is:" +x2);
        }
        else if (d == 0) {
            x1 = (-b) / 2 * a;
            x2 = (-b) / 2 * a;

            System.out.println("First Root is :" +x1);
            System.out.println("Second Root is:" +x2);
        }
        else {
            System.out.println("The roots are imaginary");
        }
    }

}
