public class RotateArray {
        public static int searchInsert(int[] nums, int target) {
//            {1,3,5,6}
            int start = 0, end = nums.length - 1, ans = nums.length, mid;
            while (start <= end) {
                mid = start + (end-start)/2;
                if (nums[mid] == target) {
                    ans = mid;
                    break;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                    ans = mid;
                }
            }
            return ans;
        }


        public static int binarySearch(int[] nums, int key) {
            int first = 0;
            int last = nums.length - 1, mid;
//nums = {9,8,7,6,5,4,3,2,1,0}
            while (first <= last) {
                mid = (first + last) / 2;
                if (nums[mid] == key) {
                    System.out.println("present");
                    return nums[mid];
                } else if (nums[mid] > key) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }
            return -1;
        }

        public static void printArray(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                System.out.println(" " + nums[i]);
            }
        }

        public static void rotateArray(int[] nums) {

            int k = 3;
            for (int i = 0; i < k; i++) {
                int last = nums[nums.length - 1];
                for (int j = nums.length - 2; j >= 0; j--) {
                    nums[j + 1] = nums[j];
                }
                nums[0] = last;
            }
            printArray(nums);
        }

        public static void main(String[] args) {
            int[] nums = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
            int[] nums1 = {1,3,5,6};
//        rotateArray(nums);
//            System.out.println(binarySearch(nums, 12));
            System.out.println(searchInsert(nums1,1));

        }

}

