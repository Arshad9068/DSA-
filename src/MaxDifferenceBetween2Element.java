public class MaxDifferenceBetween2Element {
    public static int maxDiff(int[] nums){
        int suffixMax = nums[nums.length-1];
        int maxDiff = 0;
        for(int i=nums.length-2; i>=0; i--){
            maxDiff = Math.max(maxDiff, suffixMax - nums[i]);
            suffixMax = suffixMax < nums[i] ? nums[i] : suffixMax;
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        int[] arr = {9,5,8,12,2,3,7,4};
        int result = maxDiff(arr);
        System.out.println(result);

    }
}
