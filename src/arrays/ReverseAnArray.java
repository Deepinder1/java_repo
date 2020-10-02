package arrays;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements now");

        for(int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++){
            System.out.print(a[i]);
        }



        System.out.println();

        for (int i = n - 1; i >= 0; i--){
            System.out.print(a[i]);
        }
        System.out.println();

        int [] b= {3,5,2,6};

        for (int i = b.length - 1; i >= 0; i--){
            System.out.print(b[i]);
        }

//        System.out.println();
//        int b[] = new int[n];
//        for (int i = 0; i < n; i++){
//            b[i] = a[i];
//        }
//
//        for (int i = n - 1; i >= 0; i--){
//            System.out.print(b[i]);
//        }
    }
}
