package loops;

import java.util.Scanner;

public class Patternd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i;j++){
                // this is for spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= i;j++){
                // this is for spaces
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
