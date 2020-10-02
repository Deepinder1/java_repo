package findingmaths;

public class ArmstrongNums {
    public static void main(String[] args) {
        int start = 1, end = 1000;
        // first 10 armstrong numbers
        for (int i = start; i <= end; i++ ){
            int temp = i;// we would be doing operation on temp
            int sum =0; // for storing the total of the number
            while (temp > 0) {
                //the while loop is also checking whether the ith number is armstrong num or not
                //so program check armstrong number is inside this program
                int r = temp % 10;

                sum = sum + r * r * r;

                temp /= 10;
            }
            if (i == sum){
                if (i == 1){
                    System.out.println("Armstrong numbers are");
                }
                System.out.println(i+ " ");
            }

        }
    }
}
