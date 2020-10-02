package whileloops;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        /*
        * an integer is palindrome if the reverse of that number is equal to that num
        * 121 12321
        * */
        System.out.println(" Enter the number" );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int reversedNum = 0;
        while (temp > 0){
            int lastDigit = temp % 10;

            reversedNum = reversedNum * 10 + lastDigit;
            temp /= 10;
        }
        if (n == reversedNum){
            System.out.println(n + " is palindrome");
        }
        else {
            System.out.println(n + " is not palindrome");
        }


    }
}
