package loops;

import java.util.Scanner;

public class PascalTable {
    // code from notebook

    public static void main(String[] args) {
        System.out.println(" Enter the number of Lines" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n;

        int number =1;

        for (int i = 0; i < n; i++) {

            for (int s = 1; s < spaces; s++) {
                System.out.print(" ");
            }

            number = 1;
            for (int j = 0; j<= i; j++){
                System.out.print(number+ " ");
                number = number * (i - j)/(j + 1);
            }
            spaces--;
            System.out.println();
        }
    }
}
