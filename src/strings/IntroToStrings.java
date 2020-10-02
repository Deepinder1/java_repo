package strings;

public class IntroToStrings {
    public static void main(String[] args) {
// we would convert string to char

        // it is done by using charAt() method
        String str = "Hello World";

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            System.out.println("String at " + i+ "th position is "+ ch);
        }
    }
}
