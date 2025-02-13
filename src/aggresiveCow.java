import java.util.Arrays;
import java.util.Stack;
import java.util.Stack;

public class aggresiveCow {

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }




//
//
//
//        // Function to determine if cows can be placed with at least 'minDist' distance
//        private static boolean canPlaceCows(int[] stalls, int k, int minDist) {
//            int count = 1; // Place the first cow in the first stall
//            int lastPosition = stalls[0];
//
//            for (int i = 1; i < stalls.length; i++) {
//                // Check if the current stall is far enough from the last placed cow
//                if (stalls[i] - lastPosition >= minDist) {
//                    count++;
//                    lastPosition = stalls[i]; // Place the cow here
//                    // If all cows are placed, return true
//                    if (count == k) {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }
//
//        // Function to find the maximum possible minimum distance
//        public static int maxMinDistance(int[] stalls, int k) {
//            Arrays.sort(stalls); // Sort the stall positions
//
//            int low = 1; // Minimum possible distance
//            int high = stalls[stalls.length - 1] - stalls[0]; // Maximum possible distance
//            int result = 0;
//
//            // Binary search for the maximum minimum distance
//            while (low <= high) {
//                int mid = low + (high - low) / 2;
//
//                // Check if it's possible to place cows with at least 'mid' distance apart
//                if (canPlaceCows(stalls, k, mid)) {
//                    result = mid; // Update result as this is a feasible solution
//                    low = mid + 1; // Try for a larger minimum distance
//                } else {
//                    high = mid - 1; // Try for a smaller minimum distance
//                }
//            }
//            return result;
//        }
//
//        public static void main(String[] args) {
//            int[] stalls = {1, 2, 8, 4, 9};
//            int k = 3; // Number of cows
//            System.out.println(maxMinDistance(stalls, k)); // Output: 3
//        }






        // Function to sort the stack recursively
        public static void sortStack(Stack<Integer> stack) {
            // Base case: If the stack is empty, return
            if (stack.isEmpty()) {
                return;
            }

            // Step 1: Remove the top element
            int top = stack.pop();

            // Step 2: Sort the remaining stack recursively
            sortStack(stack);

            // Step 3: Insert the removed element back in the sorted stack
            insertInSortedOrder(stack, top);

        }

        // Helper function to insert an element in the sorted stack
        private static void insertInSortedOrder(Stack<Integer> stack, int element) {
            // Base case: If stack is empty or the current element is greater than the top element, insert it
            if (stack.isEmpty() || stack.peek() <= element) {
                stack.push(element);
                return;
            }

            // Otherwise, remove the top element
            int top = stack.pop();

            // Recur to insert the element
            insertInSortedOrder(stack, element);

            // Push the top element back after inserting the current element
            stack.push(top);
        }

//
public static void main(String[] args) {
    int n = 1; // Example input
    System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
}
    }


//
//
//
