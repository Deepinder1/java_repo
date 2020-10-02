package loops;

public class SwitchCaseStatements {
    public static void main(String[] args) {
        int rating = 5;

        switch (rating){
            case 1:
            case 2:
                System.out.println("Bad Review");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 4:
            case 5:
                System.out.println("Good");
        }
    }
}
