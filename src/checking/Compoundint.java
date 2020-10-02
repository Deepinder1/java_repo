package checking;

import java.util.Scanner;

public class Compoundint {
    public static void main(String[] args) {
        //There must be 3 variables

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle amount :");
        double principle = input.nextDouble();
        System.out.println("Enter Amount of Rate :");
        double rate1 = input.nextDouble();
        double rate = rate1 / 100;

        System.out.println("Enter Time taken :");
        double time = input.nextDouble();




        //compound interest is being calculated




        double cInterest = 1 + rate;
        double cInter = Math.pow(cInterest, time);
        double amount = principle*cInter;
        System.out.println("Total amount is:" +amount);

        double interest = amount - principle;
        System.out.println("Compound interest is being calculated :" +interest);
    }

}
