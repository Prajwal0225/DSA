import java.rmi.Remote;

public class LinkedList {
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
    // size for getting LL size
    public static int size;

    // Methods
    // 1. Add in LinkedList
    // add First - O(n)
    public void addFirst(int data) {
        // step1 = Create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - new Node next = head
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;
    }

    // Add Last
    public void addLast(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - new Node next = head
        tail.next = newNode; // link

        // step3 - head = newNode
        tail = newNode;
    }

    // printing LL -> O(n)
    public void print() {
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

    // Add in the middle of the LL
    public void add(int idx, int data) {
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

        // i = idx-1; temp ->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove in a Linked List
    // remove First
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove Last
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev : i = size - 2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();

        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(4);
        l1.addLast(5);
        l1.add(2, 3);
        l1.print();
        // System.out.println(l1.size);
        l1.removeFirst();
        l1.print();

        l1.removeLast();
        l1.print();
        System.out.println(l1.size);
    }
}
