import java.util.ArrayList;

public class FindMissingAndRepeating {
    public static ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        for(int  i=0; i<arr.length; i++){
            arr[i]--;
        }

        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            arr[arr[i]%n] +=n;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%n == 2){
                list.add(arr[i]+1);
                break;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]%n == 0){
                list.add(arr[i]+1);
                break;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {2,2};
        ArrayList<Integer> l = new ArrayList<>();
        l = findTwoElement(arr);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i) + " f");
        }
    }
}

