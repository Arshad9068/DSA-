//class Node
//{
//    int data;
//    Node next;
//    Node(int d) {data = d; next = null; }
//}
//public class MergeTwoSortedList {
//    static Node sortedMerge(Node head1, Node head2) {
//        // code here
//        Node dummy = new Node(-1);
//        Node tail = dummy;
//
//        while(head1 != null && head2 != null){
//            if(head1.data <= head2.data){
//                tail.next = head1;
//                head1 = head1.next;
//            }
//            if(head1.data > head2.data){
//                tail.next = head2;
//                head2 = head2.next;
//            }
//            tail = tail.next;
//        }
//
//        if(head1 != null){
//            tail.next = head1;
//        }
//
//        if(head2 != null){
//            tail.next = head2;
//        }
//
//        return dummy.next;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
