package com.data_structures;

// A simple Java program for traversal of a linked list
public class LinkedList1 {

    Node head; // head of list

    /* Linked list Node.  This inner class is made static so
       that main() can access it */
    static class Node {

        int data;
        Node next;
        Node(int d)
        {
            this.data = d;
            next = null;
        } // Constructor
    }

    /* This function prints contents of linked list starting
     * from head */
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    // Driver's code
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList1 llist = new LinkedList1();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second; // Link first node with
        // the second node
        second.next = third; // Link second node with the third node

        // Function call
        llist.printList();
    }

}
