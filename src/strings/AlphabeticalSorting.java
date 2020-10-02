package strings;

import java.util.Scanner;

public class AlphabeticalSorting {
    public static void main(String[] args) {
        //alphabetical sorting
        int n; // for taking user input that how many string user want to enter
        String temp; //for replacing the string

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of strings");

        n = sc.nextInt();

        String[] str = new String[n];
        // making string of n size

        Scanner sc2 = new Scanner(System.in);
        // making scanner 2 for inputting strings

        System.out.println("Enter string one by one");

        for (int i = 0; i < n; i++){
            str[i] = sc2.nextLine();
        }

        //now we would do the sorting of the string

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){//nested loop would start formfirst position
                if (str[i].compareTo(str[j])>0){
                    //it compares each character of string
                    //it would compare the ascii value of strings
                    //Here the comparison is between string literals.
                    // For example string1.compareTo(string2) where string1 and string2 are String literals.
                    //string literals are sequence of characters
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
// this is also bubble sort on strings



            }
        }
        //after that we would display string in alphabettical order

        for (int i = 0; i < n; i++){
            System.out.println(str[i]);
        }

    }
}
