package DSA.linkedlists;  // Define the package where this class is located

public class SinglyLinkedList {
    private ListNode head;  // This is the head of the linked list, initially null

    // Inner static class to represent a node in the singly linked list
    private static class ListNode {
        private int data;  // Data part of the node
        private ListNode next;  // Pointer to the next node in the list

        // Constructor to create a new node with given data
        public ListNode(int data) {
            this.data = data;
            this.next = null;  // By default, the next node is null
        }
    }

    public void insertAtBeginning(int value) {
        // Create a new node with the given value
        ListNode newNode = new ListNode(value);
        // Point the new node's next to the current head of the list
        newNode.next = head;
        // Update the head to point to the new node, making it the first node in the list
        head = newNode;
    }

    public void insertAtEnd(int value) {
        // Create a new node with the given value
        ListNode newNode = new ListNode(value);
        // Check if the list is empty
        if (head == null) {
            head = newNode;  // If the list is empty, make the new node the head
            return;  // Exit the method after inserting the new node as the head
        }
        // Start from the head of the list
        ListNode current = head;
        // Traverse to the last node of the list
        while (current.next != null) {
            current = current.next;  // Move to the next node
        }
        // Set the next of the last node to the new node
        current.next = newNode;
    }

    public void insertAtPosition(int position, int data) {
        // Create a new node with the specified data
        ListNode node = new ListNode(data);
        // Special case: inserting at the head of the list (position 1)
        if (position == 1) {
            node.next = head; // Point the new node to the current head
            head = node; // Update the head to be the new node
        } else {
            // Traverse the list to find the node before the insertion point
            ListNode previous = head;
            int count = 1;
            // Move to the node just before the position where the new node will be inserted
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            // The current node is the one at the insertion point
            ListNode current = previous.next;
            // Insert the new node between the previous node and the current node
            node.next = current; // Set the new node's next to the current node
            previous.next = node; // Update the previous node's next to the new node
        }
    }

    public ListNode deleteFirstNode(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public void display() {
        ListNode current = head;  // Start with the head of the list
        // Traverse through the list until the end
        while (current != null) {
            // Print the data of the current node followed by an arrow
            System.out.print(current.data + " --> ");
            // Move to the next node
            current = current.next;
        }
        // At the end of the list, print 'null' to indicate the end of the linked list
        System.out.println("null");
    }
    public int findLength() {
        // Check if the list is empty
        if (head == null) {
            return 0;  // If the list is empty, return length 0
        }
        int count = 0;  // Initialize a counter to keep track of the number of nodes
        ListNode current = head;  // Start with the head of the list
        // Traverse through the list until the end
        while (current != null) {
            count++;  // Increment the counter for each node visited
            current = current.next;  // Move to the next node
        }
        return count;  // Return the total count of nodes
    }

    public static void main(String[] args) {
        // Create an instance of SinglyLinkedList
        SinglyLinkedList sll = new SinglyLinkedList();
        // Initialize the list with some nodes
//        sll.head = new ListNode(10);  // The head node of the list with data 10
//        ListNode second = new ListNode(1);  // Create the second node with data 1
//        ListNode third = new ListNode(8);   // Create the third node with data 8
//        ListNode fourth = new ListNode(11); // Create the fourth node with data 11
//
//        // Link the nodes together to form a singly linked list
//        sll.head.next = second;  // The head node points to the second node
//        second.next = third;     // The second node points to the third node
//        third.next = fourth;     // The third node points to the fourth node
//        // At this point, the list is: 10 -> 1 -> 8 -> 11 -> null
//
//        sll.display();  // To display the data of LinkedList
//        System.out.println("Length of Linked List: "+ sll.findLength()); //To find len of sll
//        sll.insertAtBeginning(11); //Insert new node at beginning
//        sll.display();
//
//        sll.insertAtEnd(20); //Insert new node at end
//        sll.display();
        sll.insertAtPosition(1,10);
        sll.insertAtPosition(2,20);
        sll.insertAtPosition(3,30);
        sll.display();
        System.out.println(sll.deleteFirstNode().data);
        System.out.println(sll.deleteFirstNode().data);
        System.out.println(sll.deleteFirstNode().data);
        sll.display();
    }
}
