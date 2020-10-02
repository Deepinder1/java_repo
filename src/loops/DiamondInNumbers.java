package loops;

public class DiamondInNumbers {
    public static void main(String[] args) {
        int n =4;
        int rows = 2 * n -1;


        for (int i = 1; i <= rows;i++){
            if (i <= n){
                for (int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }

                for (int j = i; j>=1; j--){
                    System.out.print(j);
                }
                for (int j = 2; j <= i ;j++){
                    System.out.print(j);
                }
            }
            else {
                for (int j = 1; j <= i - n;j++) {
                    System.out.print(" ");
                }

                for (int j = (rows - i + 1); j>=1; j--){
                    System.out.print(j);
                }

                for (int j = 2; j <= (rows - i) + 1 ; j++){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
