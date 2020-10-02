package whileloops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(" Enter the number" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // in case of integer division one gets the floor value the decimal value is not given back
        // first taking mode then dividing the number by 10
//        435 % 10 = 5 remainder will be added
//                now 43 will be left and then there will be 3 remainder added
//                and similarly 4 will be added.
        int temp = n;
        // temp is a temporary in which we put n value because temp will be again created and destroyed
        // we might want value in future
        int sum = 0;
        while (temp > 0){
            // will make a  last digit variabe in which reminder will be stored
            int lastDigit = temp % 10;
            temp /= 10;// temp = temp / 10

            sum += lastDigit;// sum = sum + lastdigit
        }
        System.out.println("The Sum of digit of " + n + " is " + sum);
        // java log math class to count the number of digits
        int numberOfDigits = (int)Math.log10(n) + 1; // (int) typecasting n to int
        System.out.println("The number of digits you entered "+ numberOfDigits);

    }
}
