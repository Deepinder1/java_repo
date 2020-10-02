package checking;

import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Length: ");
        // The input is to be stored in length
        int	length = input.nextInt();

        System.out.println("Enter the Breadth: ");
        // The input is to be stored in breadth
        int	breadth = input.nextInt();

        int area = (length*breadth);
        if (length == breadth){
            System.out.println("Bhai ye Square hai Or iska Area hai: " +area);
        }
        else {
            System.out.println("Bhai Rectangle ka AREA hai: " +area);
        }



    }
}
