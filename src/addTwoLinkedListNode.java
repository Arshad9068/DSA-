
public class addTwoLinkedListNode{
    Node head;
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Add a new node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public  Node cloneList() {
        Node temp = head;
        while (temp != null) {
            Node newNode = new Node(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode .next;
        }

        return head;
    }
    public static void main(String[] args) {
        addTwoLinkedListNode list = new addTwoLinkedListNode();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.display();
        list.cloneList();
        list.display();
    }
}

//    /* node for linked list



//*/

//    class Solution {
//        static Node addTwoLists(Node num1, Node num2) {
//            // Step 1: Reverse the input lists
//            num1 = reverse(num1);
//            num2 = reverse(num2);
//
//            Node dummy = new Node(0); // Dummy node to start the result list
//            Node curr = dummy; // Pointer to build the result list
//            int carry = 0; // To store carry-over
//
//            // Step 2: Add the reversed lists
//            while (num1 != null || num2 != null || carry > 0) {
//                int sum = carry; // Start with carry
//
//                if (num1 != null) {
//                    sum += num1.data;
//                    num1 = num1.next;
//                }
//
//                if (num2 != null) {
//                    sum += num2.data;
//                    num2 = num2.next;
//                }
//
//                carry = sum / 10; // Update carry
//                curr.next = new Node(sum % 10); // Create a node for the units digit
//
//                curr = curr.next; // Move to the next node
//            }
//
//            // Step 3: Reverse the result list to get the final sum
//            Node result= reverse(dummy.next);
//
//            result = removeLeadingZeros(result);
//
//            return result;
//        }
//
//        // Helper function to reverse a linked list
//        static Node reverse(Node head) {
//            Node prev = null, curr = head, next = null;
//            while (curr != null) {
//                next = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = next;
//            }
//            return prev;
//        }
//
//        static Node removeLeadingZeros(Node head) {
//            while (head != null && head.data == 0) {
//                head = head.next;
//            }
//            return head;
//        }
//    }

// Node *cloneLinkedList(Node *head) {
//         //CodeGenius
//         //STEP 1 input list ki nodes ke beech me op list ki node hume rkhni hai mapping create
//         if(head==NULL) return head;
//         Node * temp=head;
//         while(temp){
//         Node *n=new Node(temp->data);
//         n->next=temp->next;
//         temp->next=n;
//         temp=n->next;
//         }
//         //STEP 2 random pointer assing krde clone ll me
//         temp=head;
//         Node *head2=temp->next;
//         while(temp!=NULL){
//         if(temp->random==NULL){
//         temp->next->random=NULL;
//         }
//         else
//         temp->next->random=temp->random->next;
//         temp=temp->next->next;
//         }
//         //STEP 3 op list return krde
//         temp = head;
//         while(temp!=NULL){
//         Node * temp2=temp->next;
//         temp->next=temp2->next;
//         if(temp2->next)
//         temp2->next=temp2->next->next;
//         temp=temp->next;
//         }
//         return head2;
//         }
