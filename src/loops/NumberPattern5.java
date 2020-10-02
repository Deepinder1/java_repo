package loops;

public class NumberPattern5 {

    public static void main(String[] args) {
        // share kar dena bhai
        int n = 7;

        for( int i = 1; i <=n;i++){
            for (int j = 1; j <=n-i+1;j++){
                System.out.print("* ");
            }
            for (int j = 1;j<=2 *  (i +1);j++){
                System.out.print("  ");
            }
            for (int j = 1 ;j<=n-i+1;j++){
                System.out.print(" *");//aah
            }
            System.out.println();

        }
        System.out.println();

        for( int i = 1; i <=n;i++){
            for (int j = 1; j <=i;j++){
                System.out.print("* ");
            }
            for (int j = 1; j<=2 *  (n -i ) + 4;j++){//ah
                System.out.print("  ");
            }
            for (int j = 1; j <=i;j++){
                System.out.print(" *");
            }

            System.out.println();
        }

    }
}