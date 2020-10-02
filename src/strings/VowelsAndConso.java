package strings;

public class VowelsAndConso {
    public static void main(String[] args) {
        String str = "Deepinder Singh";

        // creating an int for counting vowels and consonants
        int vcount=0, ccount=0;

        //now converting all chars of a string to lower case

        str = str.toLowerCase();

        for (int i =0; i < str.length(); i++){

            char ch = str.charAt(i);
            if (    ch == 'a' ||
                    ch == 'e' ||
                    ch == 'i' ||
                    ch == 'o' ||
                    ch == 'u'){
                vcount++;
            }
            else if(ch > 'a' && ch <= 'z'){
                ccount++;
            }


        }
        System.out.println("Vowels = " + vcount);
        System.out.println("Consonants = " + ccount);
    }
}
