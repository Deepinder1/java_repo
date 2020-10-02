package loops;

import java.util.Scanner;

public class Forloops {
    public static void main(String[] args) {
//        for (int i =0; i <= 100; i = i + 2 ){
//            System.out.println(i);
//        }
        //now we are going to calculate sum of arithmatic progression

        int sum =0;
        int n = 10;// n tells till how much digit sum should be
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
            //      whats happening here is
            //in sum variable we are storing sum + i and i is being incremented continuously

//        for (int i = 100; i > 0; i--){
//            System.out.println("sum" +i);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number you want table of : ");
//        int tableOf = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++){
//            System.out.println(tableOf * i);
//        }
    }

}
