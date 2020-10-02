package checking;

import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        //There must be 3 variables

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle amount :");
        double principle = input.nextDouble();
        System.out.println("Enter Amount of Rate :");
        double rate = input.nextDouble();
        System.out.println("Enter Time taken :");
        double time = input.nextDouble();


        //Simple interest is being calculated
        double simpleInt = (principle*rate*time)/100;

        System.out.println("Simple interest is being calculated :" +simpleInt);
    }

}
