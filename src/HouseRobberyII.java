public class HouseRobberyII {
    public int rob1(int[] nums) {
        int n = nums.length;
        int curr1 = 0, curr2 = 0;
        int prev1 = nums[0];
//        2,3,5,

        int min =Integer.MAX_VALUE;
        int prev = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; i++) {
            curr1 = Math.max(prev1, prev);
            min = Math.min(curr1,min);
            prev1 = prev;
            prev = curr1;
        }
        return min;
    }

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
        int[] nums = {2,3,5,9};
        HouseRobberyII obj = new HouseRobberyII();
        int result = obj.rob(nums);
        System.out.println(result);
        System.out.println(obj.rob1(nums));
    }
}
