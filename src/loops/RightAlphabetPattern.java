package loops;

public class RightAlphabetPattern {
    public static void main(String[] args) {
        for (char c1 =  'A'; c1 <= 'E'; c1++ ){
            for (char c2 = 'A'; c2 <= c1;c2++){
                System.out.print(c2);
            }
            System.out.println();
        }

        for (char c1 =  'A'; c1 <= 'E'; c1++ ){
            for (char c2 = 'A'; c2 <= c1;c2++){
                System.out.print(c1);
            }
            System.out.println();
        }
    }
}
