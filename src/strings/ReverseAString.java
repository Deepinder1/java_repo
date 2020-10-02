package strings;

import java.util.Scanner;

public class ReverseAString {
    //done it on my own
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking user input
        System.out.println("Enter the string");

        String inputString = sc.nextLine();
        int length = inputString.length();


        String reverseString = "";

        for (int i = length - 1; i >=0; i--){
            reverseString = reverseString + inputString.charAt(i);
        }
        System.out.println("The reverse string is "+reverseString);
        //the above for loop is for checking and printing reverse string

    }
}
