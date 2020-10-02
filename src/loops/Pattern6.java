package loops;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("* ");//first star

        for (int i = 2; i <= n -1; i++){// rows loop starting from 2nd row going till n-2

            System.out.print("* ");//first star in row

            for (int j = 1; j <= i - 2; j++){// j will work for i - 2 spaces
                System.out.print("  ");

            }

            System.out.print("*");//last star in row
            System.out.println();

        }
        if (n > 1) {
            for (int i = 1; i <= n; i++) {// nth line stars
                System.out.print("* ");
            }
        }
    }
}
