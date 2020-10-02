package checking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Adding2numbers {

   static void addingTwonumbers(int a, int b) {
     int  sum = a + b;
       System.out.println("The sum of two numbers is " +sum);

   }
    public static void main(String[] args) {
     boolean validInput = false;

     while (true){
             System.out.println("Enter the first number");
             Scanner firstNum = new Scanner(System.in);
             System.out.println("Enter the Second number");
             Scanner secondNum = new Scanner(System.in);
             try {

                 int x = firstNum.nextInt();
                 int y = secondNum.nextInt();
                 addingTwonumbers(x,y);

             }
             catch (InputMismatchException e) {
                 System.out.println("Please enter a valid input");
             }



     }

    }
}
