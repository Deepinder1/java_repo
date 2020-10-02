package findingmaths;

public class InttoDigits {
    public static void main(String[] args) {
        int n = 7891;
        int temp = n;
        int count =  String.valueOf(n).length();//note this
        count++;

        while (temp > 0){

            count--;
            int lastDigit = temp % 10;
            temp = temp / 10;
            System.out.println("the digit at " +count+" place is "+lastDigit);
        }

    }
}
