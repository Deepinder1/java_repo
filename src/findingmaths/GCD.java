package findingmaths;

public class GCD {
    public static void main(String[] args) {
        //we are taking two nums
        int n1 = 55, n2 = 121;

//        loop will run from 1 to the smallest of the 2 nums
//        lets see how this happens inside the loop
//        we would have take two cionditions that i is less than or eqaul to both nums
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++){
            {
                if (n1 % i == 0 && n2 % i == 0){
                    // if this condition would satisfy we would put that factor in gcd
                    //gcd = greatest common divisior or is called hcf
                    gcd = i;
                }

            }
            // after that we would print highest gcd value
            System.out.println("gcd is " + gcd);
        }

    }
}
