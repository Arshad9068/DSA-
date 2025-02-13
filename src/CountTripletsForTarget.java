import java.util.Arrays;

public class CountTripletsForTarget {
    public static int solution(int[] arr, int target){
        int res = 0;

        for(int i=0; i<arr.length;i++){
            int start =i+1, end = arr.length-1;
            while(start<end){
                int currentSum = arr[i] + arr[start] +arr[end];
                if( currentSum == target){
                    res++;
                    int temp = start+1;
                    while( temp < end && arr[temp] == arr[temp-1]){
                        res++;
                        temp++;
                    }
                    end--;
                }else if( currentSum > target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        int t = 3;
        System.out.println(solution(arr,t));
        int[] arr2 ={3,5,2,1,6,9,7,8};
        Arrays.sort(arr2);
        System.out.println(arr2);
        for(int i: arr2){
            System.out.print(i);
        }
    }
}
