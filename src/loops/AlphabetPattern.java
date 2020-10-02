package loops;

public class AlphabetPattern {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("**");
        for (int i = 2; i <= n;i++){
            if (i == 3){
                System.out.println("***");
            }
            else {
                System.out.println("* *");
            }
        }
    }
}
