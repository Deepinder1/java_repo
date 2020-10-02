package findingmaths;

public class SumOfNatuaralnums {
    public static void main(String[] args) {
        int n = 10;
        int total = 0;
        for (int i = 1; i <= n; i++){
            total = total + i;
        }
        System.out.println("The sum of first "+ n + " natural numbers is "+ total);
    }
}
