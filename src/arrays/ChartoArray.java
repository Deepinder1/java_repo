package arrays;

public class ChartoArray {
    public static void main(String[] args) {
        // method 1 object method
        char[] ch = {'g', 'o', 'o', 'd'};

        String str = new String(ch);
        System.out.println(str);

//        method 2 using value of method

        String str2 = String.valueOf(ch);

        System.out.println(str2);
    }
}
