import java.util.HashMap;
import java.util.Map;

public class SubarraysWithSumK {

    public static int longestSubarray(int[] arr, int k) {
        // code here
        int length = 0;
        int cs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        for(int i=0; i<arr.length; i++){
            cs += arr[i];
            if(map.containsKey(cs-k)){
                int index = map.get(cs-k);
                int tempLength = i-index+1;
                length = Math.max(length, tempLength);
            }
            map.put(cs, i+1);
        }
        return length;
    }
        public static int countSubarrays(int arr[], int k) {
            // code here
            int ans =0, currSum=0;
            Map<Integer,Integer> mp = new HashMap();
            mp.put(0, 1);
            for(int i: arr){
                currSum+=i;
                if(mp.containsKey(currSum-k)){
                    ans+=mp.get(currSum-k);
                }
                mp.put(currSum, mp.getOrDefault(currSum, 0)+1);
            }
            return ans;
        }

    public static void main(String[] args) {
            int[] arr = {-5, 8, -14, 2, 4, 12};

//        System.out.println(countSubarrays(arr, 33 ));
        int a =-5;
//        int[] arr = {94 ,-33, -13, 40 ,-82, 94, -33, -13, 40, -82};
        System.out.println(longestSubarray(arr, a));
//        arr[] = [4, 2, 2, 6, 4], k = 6
//        System.out.println(4^2^2^6^4);
//        System.out.println(2^6^4);
//        System.out.println(4^2);
    }
}
