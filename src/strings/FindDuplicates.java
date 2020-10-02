package strings;

public class FindDuplicates {
    public static void main(String[] args) {
        String str = "good morning";

        char[] carry = str.toCharArray();

        System.out.print("The duplicate characters in above string are:");

        for (int i = 0; i < str.length(); i++){
            for (int j = i + 1; j < str.length(); j++){
                if (carry[i] == carry[j]){
                    System.out.print(carry[j]+ " ");
                    break;
                }
            }
        }
    }
}
