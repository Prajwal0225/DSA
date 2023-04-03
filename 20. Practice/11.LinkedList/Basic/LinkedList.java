import javax.print.attribute.Size2DSyntax;

public class LinkedList {

    // For creating node in LinkedList
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add Node at start of linkedList
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // otherwise
        newNode.next = head;
        head = newNode;
    }

    // adding Node at end of lindedlist
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // otherwise
        tail.next = newNode;
        tail = newNode;
    }

    // printing the linkedlist
    public static void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add in the middle of linkedList
    public static void addmidle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // deleting first node from linkedList
    public static void deleteFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        }

        // otherwise
        head = head.next;
        size--;
    }

    // deleting last node from linkedList
    public static void deleteLast() {
        if (size == 0) {
            System.out.println("LL is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        size--;
        temp = tail;
    }

    public static int LLlength() {
        Node temp = head;
        int i = 0;
        while (temp.next != null) {
            temp = temp.next;
            i++;
        }
        return i;
    }

    // helper function
    public static int helper(Node head, int key) {
        if (head.data == key) {
            return 0;
        }
        if (head == null) {
            return -1;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    // recursive search
    public static int recSearch(int key) {
        return helper(head, key);
    }

    // reurcive search
    public void reverse() {
        Node prev = null;
        // 1. tail = head
        // 2.curr = tail means curr = tail = head
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // Find and remove Nth node from end
    public void deleteNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == size) {
            head = head.next; // remove first
            return;
        }

        // sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);

        l1.addLast(7);
        l1.addLast(8);
        l1.addLast(9);
        l1.addLast(10);
        System.out.println("The size of an LinkedList is " + size);
        l1.printLL();

        // adding to middle of linkedList
        l1.addmidle(5, 6);
        l1.printLL();
        System.out.println("The size of an LinkedList is " + size);

        // deleting first Node
        l1.deleteFirst();
        l1.printLL();
        System.out.println("The size of an LinkedList is " + size);

        // deleting Last Node
        l1.deleteLast();
        l1.printLL();

        // size of an linked list
        System.out.println("The size of an LinkedList is " + size);

        // length of LL using LLlength -> Here Indexing start form '0'
        System.out.println("Length of an LinkedList : " + l1.LLlength());

        System.out.println(recSearch(8));

        l1.reverse();
        l1.printLL();

        l1.deleteNthFromEnd(3);
        l1.printLL();
    }
}
