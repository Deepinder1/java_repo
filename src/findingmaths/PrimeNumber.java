package findingmaths;

import java.util.Scanner;

public class PrimeNumber {
    static void checkPrime(int n) {
        int m = 0,flag = 0;//
        m = n/2;
        if(n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        }
        else{
            for (int i = 2; i <= m; i++){
                if(n % i == 0){
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0){
                System.out.println(n + " is a prime number");
            }
        }

    }
    public static void main(String[] args) {
        while (true){
            System.out.println("Enter the you want to check");
            Scanner sc = new Scanner(System.in);
            int y = sc.nextInt();
            checkPrime(y);
        }


    }
}
