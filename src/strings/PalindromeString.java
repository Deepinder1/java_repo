package strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        //using for loop and string charAt() function
        String reverseString = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check if its a palindrome");

        String inputString = sc.nextLine();

        int length = inputString.length();

        for (int i = length - 1; i >= 0; i--){
            reverseString = reverseString + inputString.charAt(i);
        }
        System.out.println("The reverse string is "+reverseString);
        //the above for loop is for checking and printing reverse string

        if (inputString.equals(reverseString)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }


    }
}
