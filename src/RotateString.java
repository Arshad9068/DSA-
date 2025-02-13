public class RotateString {
    // Function to check if a string can be obtained by rotating
    // another string by exactly 2 places.
//    public static String antiClockwise(String str){
//        char[] arr = str.toCharArray();
//        char first = arr[0];
//        int index = 1;
//        while(index<arr.length){
//            arr[index-1]= arr[index];
//            index++;
//        }
//        arr[arr.length-1] = first;
//        return new String(arr);
//
//    }
//    public static String rotateClockwise(String str){
//        System.out.println(str.contains("a"));
//        char[] arr = str.toCharArray();
//        char last = arr[arr.length-1];
//        int index = arr.length - 2;
//        while(index>=0){
//            arr[index+1]= arr[index];
//            index--;
//        }
//        arr[0] = last;
//        return new String(arr);
//    }
    public static String sort(String s)
    {
        // code here
        int[] alpha = new int[26];
        for(int i=0;i<s.length(); i++){
            alpha[s.charAt(i) - 'a']++;
        }
        String ans ="";
        for(int i=0; i<26; i++){
            int c = i+'a';
            while(alpha[i]>0){
                ans += (char)c;
                alpha[i]--;
            }
        }
        return ans;
    }
//    public static boolean isRotated(String s1, String s2) {
//        // Your code here
//        if(s1.length() != s2.length()){
//            return false;
//        }
//        // Clockwise
//        String singleRotated = rotateClockwise(s1);
//        System.out.println(singleRotated);
//        String TwoPRotated = rotateClockwise(singleRotated);
//        System.out.println(TwoPRotated);
//        if(TwoPRotated.equals(s2)){
//            return true;
//        }
//
//        // Anticlockwise
//
//        String one = antiClockwise(s1);
//        System.out.println(one);
//        String two = antiClockwise(one);
//        System.out.println(two);
//        if(two.equals(s2)){
//            return true;
//        }
//        return false;
//
//    }

    public static void main(String[] args) {
//        System.out.println(isRotated("amazon", "azonam"));
        System.out.println(sort("hrtaabdff"));
        String s = "hfsdfs";
        System.out.println();

    }
}