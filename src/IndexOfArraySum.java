import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IndexOfArraySum {
    public static int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s.length(); i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
    public static int maxArea(int[] height) {
        int s=0,e=height.length-1;
        int maxArea = 0;
        while(s<e){
            int width = e-s;
            int localArea = (Math.min(height[s], height[e]) * width);
            maxArea = Math.max(maxArea, localArea);
            if(height[s]<=height[e]){
                s++;
            }
            e--;
        }
        return maxArea;
    }
    public static void main(String[] args) {
//        int[] arr = {1,8,6,2,5,4,8,3,7};
//        System.out.println(maxArea(arr));
//        char last='a';
//        char i='a';
//        if(i==last){
//            System.out.println("ok");
//        }else{
//
        for(int i=0;i<10;++i){
            System.out.println(i);
        }

//        String s = "abcdefg";
//        String s1 = "";
//        System.out.println(s1.contains(String.valueOf(s.charAt(1))));
//        System.out.println(String.valueOf('i'));
//        System.out.println(s.contains("o"));
//        s.i
//        System.out.println(s.substring(1)+s.charAt(6));
//        System.out.println(longestUniqueSubstr("hqghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvs"));
//        int terget = 12;
//        int[] prefix = new int[arr.length];
//        prefix[0] = arr[0];
////        for(int i=1;i<arr.length;i++){
////            prefix[i] =prefix[i-1]+arr[i];
////        }
//        int i=0;
//        while(i<10){
//            ++i;
//            System.out.println(i);
//
//        }





//        for(int i=0; i<prefix.length;i++){
//            System.out.println(prefix[i]);
//        }

    }


}
