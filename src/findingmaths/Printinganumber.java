package findingmaths;

import java.util.Scanner;

public class Printinganumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Enter the number for which you want TABLE");
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        for (int a = 1; a < 101; a++) {

            System.out.println(n + " * " + a + " = " + n * a);

            if (a == 100) {
                System.out.println(n + " * " + a + "= " + n * a);
            }
        }
    }
}
