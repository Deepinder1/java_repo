package loops;

public class NumPattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=2 *i -1;j++){
                if (j == 1 || j == (2 * i - 1)) {// or operator is used because it checks the on each element but
                    System.out.print(i + " ");   // if we use && and for example in second row both the conditions would not be true
                }                                  // but the or || is one or the other is true
                else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
    }
}
