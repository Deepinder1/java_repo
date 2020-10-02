package checking;

import java.util.Scanner;

public class Simpleint {
    public static void main(String[] args) {
        //There must be 3 variables

        Scanner input = new Scanner(System.in);

        double principle = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        System.out.println("Enter Principle amount :");
        System.out.println("Enter Amount of Rate :");
        System.out.println("Enter Time taken :");
        //Simple interest is being calculated
        double simpleInt = (principle*rate*time)/100;

        System.out.println("Simple interest is being calculated :" +simpleInt);
    }
}
