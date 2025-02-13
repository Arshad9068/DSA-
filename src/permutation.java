import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//
//
public class permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(tempList);
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        permutation obj = new permutation();

        System.out.println(obj.permute(arr));
        String s= "dkjf";
        char[] arrr = s.toCharArray();
        for(int i:arrr){
            System.out.println(arrr[0]);
        }
    }
}