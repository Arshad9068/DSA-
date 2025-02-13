public class CustomStack {
        private int maxSize;
        private int[] stack;
        private int[] inc; // To store incremental values
        private int top;

        // Constructor: Initialize the stack and increment array
        public CustomStack(int maxSize) {
            this.maxSize = maxSize;
            stack = new int[maxSize];
            inc = new int[maxSize];
            top = -1; // Initialize the stack to be empty
        }

        // Push operation: Add element if the stack is not full
        public void push(int x) {
            if (top < maxSize - 1) {
                top++;
                stack[top] = x;
            }
        }

        // Pop operation: Remove and return the top element, apply increment if any
        public int pop() {
            if (top == -1) {
                return -1; // Stack is empty
            }
            int value = stack[top] + inc[top]; // Add the pending increment value
            if (top > 0) {
                inc[top - 1] += inc[top]; // Pass down the increment value to the next element
            }
            inc[top] = 0; // Reset the increment at this position
            top--; // Remove the top element
            return value;
        }

        // Increment operation: Increment the bottom 'k' elements by 'val'
        public void increment(int k, int val) {
            int limit = Math.min(k - 1, top); // Determine how many elements to increment
            if (limit >= 0) {
                inc[limit] += val; // Apply the increment lazily
            }
        }
    public static void main(String[] args) {
        CustomStack stk = new CustomStack(3); // Stack of size 3
        stk.push(1);  // stack becomes [1]
        stk.push(2);  // stack becomes [1, 2]
        System.out.println(stk.pop()); // returns 2 --> stack becomes [1]
        stk.push(2);  // stack becomes [1, 2]
        stk.push(3);  // stack becomes [1, 2, 3]
        stk.push(4);  // stack still [1, 2, 3], max size reached
        stk.increment(5, 100); // stack becomes [101, 102, 103]
        stk.increment(2, 100); // stack becomes [201, 202, 103]
        System.out.println(stk.pop()); // returns 103 --> stack becomes [201, 202]
        System.out.println(stk.pop()); // returns 202 --> stack becomes [201]
        System.out.println(stk.pop()); // returns 201 --> stack becomes []
        System.out.println(stk.pop()); // returns -1 --> stack is empty

        System.out.println('b'-'a');
    }
}
//Output:
//        diff
//        Copy code
//        2
//        103
//        202
//        201
//        -1
//        This implementation ensures that the increment operation is handled efficiently with lazy propagation, allowing for fast push and pop operations.
//



