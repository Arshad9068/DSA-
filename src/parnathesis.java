import java.util.ArrayList;
import java.util.List;
public class parnathesis {




        // Function to generate all well-formed parentheses combinations
        public static List<String> generateParentheses(int N) {
            List<String> result = new ArrayList<>();
            generateCombinations(result, "", 0, 0, N);
            return result;
        }

        // Helper function to generate combinations using backtracking
        private static void generateCombinations(List<String> result, String current, int open, int close, int max) {
            // Base case: If the current combination is complete
            if (current.length() == max * 2) {
                result.add(current);
                return;
            }

            // If we can add an opening parenthesis, add it
            if (open < max) {
                generateCombinations(result, current + "(", open + 1, close, max);
            }

            // If we can add a closing parenthesis, add it
            if (close < open) {
                generateCombinations(result, current + ")", open, close + 1, max);
            }
        }

        // Main function to test the code
        public static void main(String[] args) {
            int N = 3; // Example input
            List<String> combinations = generateParentheses(N);
            System.out.println("All possible combinations for N = " + N + " are: ");
            for (String combination : combinations) {
                System.out.println(combination);
            }
        }
    }


