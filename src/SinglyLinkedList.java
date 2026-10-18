/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        Buse Melek Yorulmaz
 * Your Student ID:  250444030
 * Your Date:        12.10.2026
 */

public class SinglyLinkedList {

    //instance variable

    private Node head;

    //constructor

    public SinglyLinkedList() {
        head = null;
    }

    //adding a node to the end of the list

    public void add(int data) {
        // 1. create a new Node.
        Node newNode = new Node(data);

        // 2. if the list is empty, make the new node the head.
        if(head == null) {
            head = newNode;
            return;
        }

        // 3. otherwise, traverse to the last node.
        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        // 4. link the last node to the new node.
        current.next = newNode;
    }

    //displaying the linked list

    public void display() {
        // Start from head.
        Node current = head;

        // Visit each node using next.
        // Print the data values in this format:
        //
        // 1 --> 2 --> 3 --> 4 --> 5 --> NULL
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("NULL");
    }


    //finding the middle node

    public Node findMiddle() {
        if(head == null){
            return null;
        }
        //adding counter
        int count = 0;
        Node current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        //resetting current back to head
        current = head;

        //finding and returning the middle node.
        int midIndex = count/2;
        for (int i =0; i < midIndex; i++){
            current = current.next;
        }

        return current;
    }

    //getting the head
    public Node getHead() {
        return head;
    }
}
