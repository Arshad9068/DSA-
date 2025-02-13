import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

        public static List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> nums = new ArrayList<Integer>();
            int r = matrix.length, c = matrix[0].length;
            int top = 0, left = 0, right = c-1, bottom = r-1;
            while(left<=right){
                // top part
                for(int i=left; i<=right; i++){
                    nums.add(matrix[top][i]);
                }
                top++;

                //  right part
                for(int i=top; i<=bottom; i++){
                    nums.add(matrix[i][right]);

                }
                right--;
                //  Bottom part
                if(top<=bottom){
                    for(int i=right; i>=left; i--){
                        nums.add(matrix[bottom][i]);

                    }
                    bottom--;
                }

                // left part
                if(left<=right){
                    for(int i=bottom; i>=top; i--){
                        nums.add(matrix[i][left]);

                    }
                    left++;
                }
            }
            return nums;
        }

    public static void main(String[] args) {
        int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        List<Integer> list = spiralOrder(arr);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
}

