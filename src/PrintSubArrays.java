public class PrintSubArrays {
    public static  void printSubArrays(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j = 0 ; j>=arr.length;j--){
                for(int k=j; k<=j+i;k++){
                    System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [] arr = {4,3,7,2};
        printSubArrays(arr);

    }
}
