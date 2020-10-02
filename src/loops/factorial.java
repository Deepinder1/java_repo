package loops;

public class factorial {
    public static void main(String[] args) {
        int numUptoFactorial = 5;
        int factorial =1;
        for (int i = numUptoFactorial; i >= 1; i-- ){
            factorial = factorial * i;
        }
        System.out.println(factorial);
/*
* first we ask upto how much number we want factorial
* then we take an int in which we would take factorial value
* 5*4*3*2*1
*
* */
    }
}
