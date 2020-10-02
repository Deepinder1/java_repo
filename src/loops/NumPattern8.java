package loops;

public class NumPattern8 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = n; i >= 1; i--)
        {

            for (int j = 1; j < i; j++)
            {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {// j ki value i the brabr
                if (j == 10) {
                    System.out.print("0 ");
                }


                else {
                    System.out.print(j + " ");
                }
            }
            for(int j = n - 1;j >= i;j--){
                {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }

    }
}
