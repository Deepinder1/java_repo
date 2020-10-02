package arrays;

import java.util.Scanner;

public class AverageMarksofstu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students");
        int n = sc.nextInt();

        // making array of n size and asking the value from the user

        int marks[] = new int[n];
        System.out.println("Enter the marks now ");
        // asking by running loop
        for (int i =0; i < n; i++){
            // every ith marks is postedin ith-1 position
            marks[i] = sc.nextInt();

        }
        // calculating average marks
        int averageMarks = 0;
        for (int i = 0; i < n; i++){
            averageMarks += marks[i];// average marks = marks + average makr previous average marks

        }
        averageMarks /= n;
        System.out.println("the average marks are " + averageMarks);

    }

}
