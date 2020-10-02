package findingmaths;

public class CubeSqrt {
    public static void main(String[] args) {
        //finding cube root and sqrt
        double n = 64;

        double result1 = Math.sqrt(n);
        double result2 = Math.cbrt(n);

        System.out.println("The Sqrt = " + result1 + " and cube root = "+result2);
    }
}
