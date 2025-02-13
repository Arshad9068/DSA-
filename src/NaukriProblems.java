import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
//
public class NaukriProblems {
//    public String largestNumber(int[] nums) {
//        String[] numStrs = new String[nums.length];
//        for(int i=0; i<nums.length; i++){
//            numStrs[i] = String.valueOf(nums[i]);
//        }
//
//        Arrays.sort(numStrs, (a, b) -> (a+b).compareTo(a+b));
//
//        if(numStrs[0].equals("0")) {
//            return "0";
//        }
//
//        StringBuilder result = new StringBuilder();
//        for(String numStr : numStrs){
//            result.append(numStr);
//        }
//        return result.toString();
//    }

//    public static int optimalStrategyOfGame(int[] coins, int n) {
//        // Write your code here.
//        int[][] dp = new int[n][n];
//        for(int g=0; g<dp.length;g++){
//            for(int i=0, j=g; j<dp.length; j++,i++){
//                if(g==0){
//                    dp[i][j] = coins[i];
//                }else if(g==1){
//                    dp[i][j] = Math.max(coins[i], coins[j]);
//                }else{
//                    int val1 = coins[i]+ Math.min(dp[i+2][j], dp[i+1][j-1]);
//                    int val2 = coins[j]+ Math.min(dp[i+1][j-1], dp[i][j-2]);
//                    int val = Math.max(val1, val2);
//                    dp[i][j] = val;
//                }
//            }
//        }
//        return dp[0][coins.length-1];
//

//public class NaukriProblems {

        // Helper method to determine if a word is a number
        private static boolean isNumber(String word) {
            return word.matches("\\d+");
        }

        // Main method to sort sentences
        public static List<String> sortSentences(String[] sentences) {
            List<String> letterSentences = new ArrayList<>();
            List<String> numberSentences = new ArrayList<>();

            // Separate sentences into letter-sentences and number-sentences
            for (String sentence : sentences) {
                String[] words = sentence.split(" ", 2); // Split into identifier and rest of the sentence
                String firstWordAfterIdentifier = words[1].split(" ")[0]; // Get the first word after the identifier

                // Check if the first word after identifier is a number or a letter word
                if (isNumber(firstWordAfterIdentifier)) {
                    numberSentences.add(sentence);
                } else {
                    letterSentences.add(sentence);
                }
            }

            // Sort letter-sentences lexicographically ignoring identifiers
            Collections.sort(letterSentences, (a, b) -> {
                // Split each sentence into identifier and rest of the sentence
                String[] splitA = a.split(" ", 2);
                String[] splitB = b.split(" ", 2);
                String idA = splitA[0];
                String idB = splitB[0];
                String restA = splitA[1];
                String restB = splitB[1];

                // Compare the rest of the sentences first, then the identifiers if they are the same
                int cmp = restA.compareTo(restB);
                if (cmp == 0) {
                    return idA.compareTo(idB); // Use identifiers to break ties
                }
                return cmp;
            });

            // Combine the sorted letter-sentences with the number-sentences in their original order
            List<String> result = new ArrayList<>();
            result.addAll(letterSentences);
            result.addAll(numberSentences);

            return result;
        }

        // Example usage
        public static void main(String[] args) {
            String[] sentences = {
                    "rating1 2143 1706",
                    "g1 raone",
                    "avengers1 assemble",
            };

            List<String> sortedSentences = sortSentences(sentences);
            for (String sentence : sortedSentences) {
                System.out.println(sentence);
            }
        }
}



