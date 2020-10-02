package findingmaths;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a < b) {
            if (a < c) {
                System.out.println("The First number you entered is Small");
            }
        }
        else if (b < c) {

            System.out.println("The Second number you entered is small");
        } else {
            System.out.println("The Third number you entered is small");
        }
        if (a == b) {
            if (a == c) {
                System.out.println("All the 3 numbers are same");
            } else {
                System.out.println("First and Second numbers are same");
            }
        } else if (b == c) {
            System.out.println("Third and Second numbers are same");
            System.out.println();
        }
    }
}
