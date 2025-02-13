public class longestPalindrom {
    public static int longestPalindrome(String s) {
        int[] small = new int[26];
        int[] capital = new int[26];
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) >= 'a'){
                small[s.charAt(i) - 'a']++;
            }else{
                capital[s.charAt(i) - 'A']++;
            }
        }
        int count =0;
        boolean odd = false;
        for(int i=0; i<26; i++){
            if(small[i] % 2 == 0){
                count +=small[i];
            }else{
                count += small[i]-1;
                odd = true;
            }
            if(capital[i] % 2 == 0){
                count += capital[i];
            }else{
                count += capital[i]-1;
                odd = true;
            }
        }
        if(odd){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abccccdd"));
    }
}
