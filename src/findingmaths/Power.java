package findingmaths;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms");
            int result = 1;
        int a = sc.nextInt();
        int b = sc.nextInt();// b represents power or the number of time a will be multiplied
//        for (int i = 0; i < b; i++){
//            result *= a;
//
//        }
//        System.out.println(result);



         result = (int) Math.pow(a, b);
        System.out.println(a +"^" + b + "="+ result);


    }
}
