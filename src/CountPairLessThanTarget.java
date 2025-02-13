import java.util.Arrays;

public class CountPairLessThanTarget {
    public static int solution(int[] arr, int  target){
        int ans =0;
        int start =0, end = arr.length-1;
        //  sort the array

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            start = i+1;
            end = arr.length-1;
            while(start<=end){

                int sum = arr[i]+arr[start];
                if(sum<target){
                    ans++;
                    start++;
                }else {
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int diff = Integer.MAX_VALUE;
        int[] arr = {1,10,22,28,29,30,40};
        int t = 54;
        System.out.println(solution(arr, t));
    }
}
