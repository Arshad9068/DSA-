
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

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
    public Node kthNode(int k){
        Node temp = head;
        int l=1;
        while(temp.next != null){
            if(k==l){
                return temp;
            }
            l++;
            temp=temp.next;
        }
        return null;
    }
    public void mergeList(Node l1){
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next=l1;
    }

    public void reverseKGroup(Node temp){
        System.out.println(temp.data);
        Node current =head;
        Node prev = temp;
        while(current!=null && current!=temp){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head= prev;
    }
    // Rotate the linked list by k places
    public void rotate(int k) {
        if (head == null || k == 0) {
            return;
        }

        // Step 1: Find the length of the list
        Node current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }

        // Step 2: Normalize k
        k = k % length;
        if (k == 0) {
            return; // No rotation needed
        }

        // Step 3: Make the list circular
        current.next = head; // Connect the tail to the head

        // Step 4: Traverse to the new tail (length - k - 1 steps from the head)
        int stepsToNewTail = length - k;
        Node newTail = head;
        System.out.println(newTail.data);
        for (int i = 1; i < k; i++) {

            newTail = newTail.next;
            System.out.println(newTail.data);

        }

        // Step 5: Update head and break the circle
        head = newTail.next;
        newTail.next = null;
    }

    // Display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        LinkedList list1 = new LinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(10);
        list1.add(7);
        list1.add(8);
        list1.add(9);

//        list.add(50);

//        System.out.println("Original List:");
//        list.display(); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> null
//
//        int k = 6;
//        list.rotate(k);
//
//        System.out.println("Rotated List by " + k + " positions:");
//        list.display(); // Output: 4 -> 5 -> 1 -> 2 -> 3 -> null
//        list.reverseKGroup();
//        list.mergeList(list1.head);
        list.display();
        System.out.println(list.kthNode(4).data);
        list.reverseKGroup(list.kthNode(4).next);
        list.display();



    }
}

