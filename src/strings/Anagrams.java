package strings;

public class Anagrams {
    public static void main(String[] args) {
        String a = "aaba";
        String b = "abcd";

       boolean isAnagram = false;


//        boolean visited[] = new boolean[b.length()];
//        for (int i = 0; i < visited.length; i++) {
//            visited[i] = true;
//        }
//
//
//        if (a.length() == b.length()) {
//            for (int i = 0; i < a.length(); i++) {
//                char c = a.charAt(i);
//                for (int j = 0; j < b.length(); j++) {
//                    if (b.charAt(j) == c &&  !visited[j]) {
//                         visited[j] = true;
//                        isAnagram = true;
//                        break;
//                    }
//                }
//                if (!isAnagram) {
//                    break;
//                }
//            }
//        }
        int al[] = new int[256];
        int bl[] = new int[256];

        for (char c : a.toCharArray()){//if pc gets a character value we
            int index = (int) c;// here we convert the character value to ascii value
            al[index]++;
        }

        for (char c : b.toCharArray()){
            int index = (int) c;
            al[index]++;
        }

        if (isAnagram) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
