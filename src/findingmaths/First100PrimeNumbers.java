package findingmaths;

import java.util.Scanner;

public class First100PrimeNumbers {
    public static void main(String[] args) {
        int count = 1;
        int n = 15;
        for ( int i = 2;count<=n;i++){
            boolean isPrime = true;
            for (int j = 2;j<i;j++){
                if (i % j == 0 ){
                    isPrime = false;
                    break;

                }

            }if (isPrime==true ) {
                System.out.println(i);
                count++;
            }

        }
    }
}
