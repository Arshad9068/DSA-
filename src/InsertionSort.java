import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InsertionSort {
//    public static void main(String[] args) {
////        int[] arr = {1,3,6,8,9,4,2,5};
////
////        for(int i=0; i<arr.length;i++){
////            for(int j=i; j>0; j--){
////                if(arr[j]<arr[j-1]){
////                        int temp = arr[j];
////                        arr[j] = arr[j-1];
////                        arr[j-1] = temp;
////                }
////                else{
////                    break;
////                }
////            }
////        }
////        for(int i =0; i<arr.length; i++){
////            System.out.println(" "+arr[i]);
////
////        }
////        System.out.println('d'-'a');
////        int arr2[] = new int[26];
////        arr2['t'-'a']=1;
////        System.out.println("this is XOR "+(1^3^4^8));
////        for (int i = 0; i < arr2.length; i++) {
////            System.out.print(" " + arr2[i]);
////        }
////
////       int []
//    }
//    public static void main(String[] args) {
//        // Initialize the 2D array with the given values
//        int[][] queries = {
//                {0, 1},
//                {1, 2},
//                {0, 3},
//                {3, 3}
//        };
//
//        // Print the 2D array to verify the values
//        System.out.println(queries[1][1]);
//        for (int i = 0; i < queries.length; i++) {
//            for (int j = 0; j < queries[i].length; j++) {
//                System.out.print(queries[i][j] + " ");
//            }
//            System.out.println();
//        }
//        String s1 = "this apple is sweet";
//        String s2 = "this apple is sour";
//        String s = s1 + " " + s2;
//
//        // Create a map to store the word counts
//        Map<String, Integer> wordCount = new HashMap<>();
//
//        // Split the combined string into words
//        String[] words = s.split(" ");
//
//        // Count the occurrences of each word
//        for (String word : words) {
//            System.out.println(word+" "+(wordCount.getOrDefault(word,0)+1));
//            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
//        }
//
//        // Create a list to store the uncommon words (those with a count of 1)
//        List<String> result = new ArrayList<>();
//
//        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
//            if (entry.getValue() == 1) {
//                result.add(entry.getKey());
//            }
//        }
//
//        System.out.println(result);
//    }


//    public static String strWithout3a3b(int A, int B) {
        // Write your code here
//        String str = new String();
//        while((m+n)>0){
//            if(str.endsWith("11")){
//                str=str+"0";
//                n--;
//            }else if(str.endsWith("00")){
//                str=str+"1";
//                m--;
//            }else if(m>=n){
//                str =str+"1";
//                m--;
//            }else{
//                str =str+"0";
//                n--;
//            }
//        }
//        return str;
//        }
//        StringBuilder sb = new StringBuilder(A + B);
//        while (A + B > 0) {
//            String s = sb.toString();
//            if (s.endsWith("aa")) {
//                sb.append("b");
//                B--;
//            } else if (s.endsWith("bb")) {
//                sb.append("a");
//                A--;
//            } else if (A >= B) {
//                sb.append("a");
//                A--;
//            } else {
//                sb.append("b");
//                B--;
//            }
//        }
//        return sb.toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(strWithout3a3b(1,6));
//    }
////}
////        return sb.toString();
////    }
//
//
////public class BinaryStringGenerator {
//
//    public static String generateValidBinaryString(int M, int N) {
//        StringBuilder result = new StringBuilder();
//
//        // Current counts of 0's and 1's
//        int count0 = M;
//        int count1 = N;
//
//        // Build the string
//        while (count0 > 0 || count1 > 0) {
//            // Check if we should add '0'
//            if (count0 > count1) {
//                if (result.length() >= 2 && result.charAt(result.length() - 1) == '0' && result.charAt(result.length() - 2) == '0') {
//                    // We have "00", we need to add '1' if possible
//                    result.append('1');
//                    count1--;
//                } else {
//                    // Add '0'
//                    result.append('0');
//                    count0--;
//                }
//            } else {
//                // Check if we should add '1'
//                if (result.length() >= 2 && result.charAt(result.length() - 1) == '1' && result.charAt(result.length() - 2) == '1') {
//                    // We have "11", we need to add '0' if possible
//                    result.append('0');
//                    count0--;
//                } else {
//                    // Add '1'
//                    result.append('1');
//                    count1--;
//                }
//            }
//        }
//
//        return result.toString();
//    }
//
//    public static void main(String[] args) {
//        int M = 6; // Example number of 0's
//        int N = 6; // Example number of 1's
//
//        String binaryString = generateValidBinaryString(M, N);
//        System.out.println("Generated Binary String: " + binaryString);
//    }
//}
//

    }
//}
