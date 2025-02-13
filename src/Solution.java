//import java.util.Map;
//import java.util.TreeMap;
//
////import java.util.Arrays;
////
/////**
//// * Definition for singly-linked list.
//// * public class ListNode {
//// *     int val;
//// *     ListNode next;
//// *     ListNode() {}
//// *     ListNode(int val) { this.val = val; }
//// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//// * }
//// */
////class Solution {
////    public int  GCD(int a, int b){
////        while(b!=0){
////            int temp = b;
////            b=a%b;
////            a=temp;
////
////        }
////        return a;
////    }
////    public ListNode insertGreatestCommonDivisors(ListNode head) {
////        if(head.next==null){
////            return head;
////        }
////        ListNode ans = head;
////
////        while(head.next!=null){
////            int gcdValue = GCD(head.val,head.next.val);
////            System.out.println("GCD VALUE"+gcdValue);
////            ListNode temp = new ListNode(gcdValue);
////            temp.next=head.next;
////            head.next=temp;
////            head=temp.next;
////        }
////        return ans;
////    }
////}
////class BinaryTreeNode<T> {
////    T data;
////    BinaryTreeNode<T> left;
////    BinaryTreeNode<T> right;
////
////    public BinaryTreeNode(T data) {
////        this.data = data;
////    }
////}
////
////public class Solution {
////
////    // Helper function to find LCA of two nodes in the binary tree
////    private static BinaryTreeNode<Integer> findLCA(BinaryTreeNode<Integer> root, int n1, int n2) {
////        // Base case: if the root is null or matches either of the nodes, return root
////        if (root == null || root.data == n1 || root.data == n2) {
////            return root;
////        }
////        // Search in left and right subtrees
////        BinaryTreeNode<Integer> left = findLCA(root.left, n1, n2);
////        BinaryTreeNode<Integer> right = findLCA(root.right, n1, n2);
////
////        // If both sides return a node, then the root is the LCA
////        if (left != null && right != null) {
////            return root;
////        }
////
////        // Otherwise, return the non-null result (left or right)
////        return left != null ? left : right;
////    }
////
////    // Main function to find LCA of three nodes
////    public static BinaryTreeNode<Integer> lcaOfThreeNodes(BinaryTreeNode<Integer> root, int node1, int node2, int node3) {
////        // Find the LCA of the first two nodes
////        BinaryTreeNode<Integer> lca12 = findLCA(root, node1, node2);
////
////        // Find the LCA of the above result with the third node
////        return findLCA(root, lca12.data, node3);
////    }
////
////    public static void main(String[] args) {
////        // Construct the binary tree for testing
////        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
////        root.left = new BinaryTreeNode<>(2);
////        root.right = new BinaryTreeNode<>(3);
////        root.left.left = new BinaryTreeNode<>(4);
////        root.left.right = new BinaryTreeNode<>(5);
////        root.right.left = new BinaryTreeNode<>(6);
////        root.right.right = new BinaryTreeNode<>(7);
////        root.right.right.left = new BinaryTreeNode<>(8);
////        root.right.right.right = new BinaryTreeNode<>(10);
////
////        // Example to find the LCA of nodes 7, 8, and 10
////        BinaryTreeNode<Integer> lca = lcaOfThreeNodes(root, 7, 8, 10);
////        System.out.println("LCA of 7, 8, 10: " + lca.data); // Output should be 1
////    }
////}
//public class Solution {
////    public static int minOperations(String str) {
////        int n = str.length();
////        int countPattern1 = 0; // Counts changes needed to match pattern '010101...'
////        int countPattern2 = 0; // Counts changes needed to match pattern '101010...'
////
////        TreeMap<Integer, Integer> calcy = new TreeMap<>();
////        calcy.put(1,11);
////        calcy.put(2,22);
////        calcy.put(3,33);calcy.put(7,77);
////        calcy.put(4,44);
////        calcy.put(5,55);
////        calcy.put(6,66);
////
////
////
////        calcy.ceilingKey(7);
//////        calcy.floorKey(7);
////        calcy.higherEntry(8);
////        // Loop through the string and compare each character with both patterns
////        for (int i = 0; i < n; i++) {
////            char expectedForPattern1 = (i % 2 == 0) ? '0' : '1'; // Pattern '010101...'
////            char expectedForPattern2 = (i % 2 == 0) ? '1' : '0'; // Pattern '101010...'
////
////            // Compare with pattern starting with '0' (010101...)
////            if (str.charAt(i) != expectedForPattern1) {
////                countPattern1++; // Increment mismatch count for pattern 1
////            }
////
////            // Compare with pattern starting with '1' (101010...)
////            if (str.charAt(i) != expectedForPattern2) {
////                countPattern2++; // Increment mismatch count for pattern 2
////            }
////        }
////
////        // Return the minimum of the two counts
////        return Math.min(countPattern1, countPattern2);
////    }
//
//    public static void main(String[] args) {
////        String str = "1010";
//
//        TreeMap<Integer, Integer> calendar = new TreeMap<>();
////        calendar.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
//        calendar.put(10,20);
//        calendar.put(15,25);
//
//
//
////        calcy.ceilingKey(7);
////        calcy.floorKey(7);
//        int start =15;
//        int end = 25;
//        Map.Entry<Integer, Integer> pair = calendar.higherEntry(start);
//        boolean res = end <= pair.getValue();
//        System.out.println(res);
////        System.out.println("Minimum operations to make the string beautiful: " + minOperations(str)); // Output: 0
//    }
//}
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {

        private static HashMap<String, List<Integer>> userMessage;

        public Solution(){
            userMessage = new HashMap<>();
        }
        public static void receiveMessage(String user, int time){
            // Write your code here

            userMessage.putIfAbsent(user, new ArrayList<Integer>());
            userMessage.get(user).add(time);
        }
        public static ArrayList<Integer> getMessageCount(int l, int r, String user, int k){
            // Write your code here
            List<Integer> MessageTime = userMessage.getOrDefault(user, new ArrayList<>());

            Collections.sort(MessageTime);

            ArrayList<Integer> result = new ArrayList<>();

            int currentStart = l;

            while(currentStart<=r){
                int count =0;
                int currentEnd = Math.min(currentStart + k-1, r);
                for(int time :MessageTime){
                    if(time >= currentStart && time<=currentEnd){
                        count++;
                    }
                }
                result.add(count);
                currentStart += k;
            }
            return result;
        }


    public static void main(String[] args) {
        Solution service = new Solution();
//        1 abc 5
//        1 def 7
//        1 abc 9
//        1 abc 3
//        2 5 10 abc 3
        // Type-1 queries: Users receive messages at certain times
        service.receiveMessage("abc", 5);
        service.receiveMessage("def", 7);
        service.receiveMessage("abc", 9);
        service.receiveMessage("abc", 3);
//        service.receiveMessage("", 15);
//        service.receiveMessage("Bob", 25);

        // Type-2 query: Get message count for Alice in chunks of size 35 from time 10 to 100
        List<Integer> result = service.getMessageCount(5
                , 10, "abc", 3);

        // Print the result
        System.out.println(result);  // Expected output: [1, 2, 1]
    }
}
