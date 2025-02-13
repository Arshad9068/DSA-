import java.util.List;

public class PairsOfArray {
    public static int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int prefix = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] >= nums[i-1]){
                prefix += nums[i];
                max = Math.max(prefix, max);
            }else{
                prefix = nums[i];

            }
        }
        return max;

    }
    public static void sizedSubArray(int[] arr){
        int l =1,r=2;
        int minSum = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(i==l || i==r){
                for(int j=0; j<arr.length-i; j++){
                    int prefix = 0;
                    for(int k = j; k<=j+i;k++) {
                        System.out.print(arr[k] + " ");
                        prefix += arr[k];
                    }
                    System.out.print(",");
                    if(prefix>0){
                        minSum = Math.min(prefix, minSum);
                    }
                }
            }else{
                continue;
            }
            System.out.println();
        }
        System.out.println("MinimumSum is "+minSum);
    }
    public static void main(String[] args) {
        int[] arr = {-2, 2, -3, 1};
        sizedSubArray(arr);
//        List<Integer> lst =
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr.length-i; j++){
//                for(int k = j; k<=j+i;k++) {
//                    System.out.print(arr[k] + " ");
//                }
//                System.out.print(",");
//            }
//            System.out.println();
//        }
//        int[] arr2 = {3,6,10,1,8,9,9,8,9};
//        System.out.println(maxAscendingSum(arr2));
    }
}



