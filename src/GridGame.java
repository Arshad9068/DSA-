public class GridGame {
    public static long gridGame(int[][] grid) {
        // find the First row sum
        int firstRowSum = grid[0][0];
        for(int i=0;i<grid[0].length;i++){
            firstRowSum += grid[0][i];
        }
        int secondRowSum = 0;
        int minimumSum = Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length; i++){
            firstRowSum -= grid[0][i];

            minimumSum = Math.min(minimumSum, Math.max(firstRowSum, secondRowSum));
            secondRowSum += grid[1][i];
        }
        return minimumSum;
    }

    public static void main(String[] args) {
        int[][] arr= {{2,5,4},{1,5,1}};
        System.out.println(gridGame(arr));
    }
}
