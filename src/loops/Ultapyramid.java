package loops;

public class Ultapyramid {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++)
        {

            for (int j = 1; j < i; j++)
            {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
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
