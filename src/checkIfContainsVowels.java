import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkIfContainsVowels {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int sum = 0;
        int max =0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(sum>max){
                max=sum;
            }else{
                max=sum;
                sum=0;
            }
        }
        return max;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] ans = new int[queries.length];
        int n = queries.length;
        int i=0;
        while(i<n){
            int start = queries[i][0];
            int end = queries[i][1];
            int count =0;
            while(start<=end){
                String s = words[start];
                char first = s.charAt(0);
                char last = s.charAt(s.length()-1);

                if((first == 'a' || first == 'e'||first=='i'||first=='o'||first=='u') && (last == 'a' || last == 'e' || last=='i' || last=='o' || last=='u')){
                    count++;
                }
                start++;
            }
            ans[i]=count;
            i++;
        }
        return ans;
    }
    double power(double b, int e) {
        // code here
        double ans =1;
        if(e>0){
            while(e>0){
                if((e&1)!=0){
                    ans = ans*b;
                }
                b=b*b;
                e=e>>1;
            }
        }else{
            while(e<0){
                if((e&1)!=0){
                    ans = ans*b;
                }
                b=b*b;
                e=e>>1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        checkIfContainsVowels obj = new checkIfContainsVowels();
//        String[] arr = {"aba","bcb","ece","aa","e"};
//        int[][] arr2 = {{0,2},{1,2},{1,1}};
//        int [] arr3 = obj.vowelStrings(arr,arr2);
//        for(int i:arr3){
//            System.out.print(i);
//        }
//        System.out.println(obj.power(3,-3));
        List<List<Integer>> ans = new ArrayList<>();
//        ans.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));//        ans.get(0).add(1,);
        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1,4);
//        System.out.println(ans.arget(0));
//        int[] num = {1,2,3,4};
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        System.out.println(arr);
        ans.add(arr);
        char[] charArray = {'a', 'b', 'c'};
//        String str = String.valueOf(charArray);
//        String str = toString(charArray);
//        System.out.println();
        int[] ar = {1,2,3,-2,5};
        System.out.println(obj.maxSubarraySum(ar));

    }
}
