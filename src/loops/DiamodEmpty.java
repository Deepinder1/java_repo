package loops;

public class DiamodEmpty {
    public static void main(String[] args) {
        int n = 5;
        int rows = 2 * n -1;


        for (int i = 1; i <= rows;i++){
            if (i <= n){
                for (int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }

                for (int j = 1; j <= 2 * i - 1; j++){
                    if (j == 1 || j == 2 * i -1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            else {
                for (int j = 1; j <= i - n;j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * (rows - i) + 1 ; j++){
                    if (j == 1 || j == 2 * (rows - i) + 1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
