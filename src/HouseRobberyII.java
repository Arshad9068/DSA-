public class HouseRobberyII {
    public int rob(int[] nums) {
        int n= nums.length;
        int curr1=0,curr2=0;
        int prev1 = nums[0];
        int prev = Math.max(nums[0],nums[1]);
        for(int i=2;i<n-1;i++){
            curr1 = Math.max(nums[i]+prev1,prev);
            prev1 = prev;
            prev = curr1;
        }

        prev1 = nums[1];
        prev = Math.max(nums[1],nums[2]);
        for(int i=3; i<n; i++){
            curr2 = Math.max(nums[i]+prev1, prev);
            prev1 = prev;
            prev = curr2;
        }
        return Math.max(curr1,curr2);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        HouseRobberyII obj = new HouseRobberyII();
        int result = obj.rob(nums);
        System.out.println(result);
    }
}
