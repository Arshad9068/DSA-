public class wordFinder {
    static boolean isVowel(char ch)
    {
        return ( ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' ||
                ch == 'u');
    }
    public static void main(String[] args) {

        int count_vowels = 0, count_conso = 0;
        int hard_words = 0, easy_words = 0;
        int consec_conso = 0;
        String str = "arshad malik hi aalikjh hiedreee";
        String str2 = "We are geeks";

        for (int i = 0; i < str.length(); i++) {
            // Check if current character is vowel
            // or consonant
            if (isVowel(Character.toLowerCase(str.charAt(i)))) {
                // Increment if vowel
                count_vowels++;
                consec_conso = 0;
            }

            // Increment counter for consonant
            // also maintain a separate counter for
            // counting consecutive consonants
            else if (str.charAt(i) != ' ') {
                count_conso++;
                consec_conso++;
            }

            if (consec_conso==3){
                hard_words++;
//                move to next word
                while(i<str.length() && str.charAt(i) != ' '){
                    i++;
                    count_vowels=0;
                    count_conso=0;
                    consec_conso=0;
                }
            }
            else if (i<str.length() && (str.charAt(i)==' ' || i==str.length()-1)) {
                if (count_conso > count_vowels) {
                    hard_words++;
                } else {
                    easy_words++;
                }
                count_conso = 0;
                count_vowels = 0;
                consec_conso = 0;
            }
        }
        System.out.println(hard_words +" " + easy_words);
    }
}
