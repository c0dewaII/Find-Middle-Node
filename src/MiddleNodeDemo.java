/**
 * MiddleNodeDemo.java
 *
 * Tests the singly linked list and findMiddle() method.
 *
 * Your Name:        Buse Melek Yorulmaz
 * Your Student ID:  250444030
 * Your Date:        12.10.2026
 */

public class MiddleNodeDemo {

    public static void main(String[] args) {

        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        // Test 1: Odd number of nodes
        // 1. created a SinglyLinkedList
        System.out.println("List 1:");

        // 2. add 1,2,3,4,5 Nodes to the list
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // 3. display the list
        list1.display();

        // 4. found and print the middle Node
        Node middle1 = list1.findMiddle();
        if (middle1 != null){
            System.out.println("Middle Node: " + list1.findMiddle().data);
        } else {
            System.out.println("The list is empty, no middle node!");
        }

        // Test 2: Even number of nodes
        // 1. created another SinglyLinkedList
        System.out.println("List 2:");

        // 2. add 10,20,30,40,50,60 Nodes to the list
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);

        // 3. display the list
        list2.display();

        // 4. found and print the middle Node
        Node middle2 = list2.findMiddle();
        if (middle2 != null){
            System.out.println("Middle Node: " + list2.findMiddle().data);
        } else {
            System.out.println("The list is empty, no middle node!");
        }
    }
}