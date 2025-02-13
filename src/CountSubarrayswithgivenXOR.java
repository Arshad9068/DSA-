import java.util.HashMap;
import java.util.Map;

public class CountSubarrayswithgivenXOR {
    public static int Solution(int[] arr, int k){
        int cxor = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int ans =0;
        for(int i:arr){
            cxor ^= i;
            if(map.containsKey(cxor^k)){
                ans+=map.get(cxor^k);
            }
            map.put(cxor, map.getOrDefault(cxor,0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        System.out.println(Solution(arr,6));

    }
}
