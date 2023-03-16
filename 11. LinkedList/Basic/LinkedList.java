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

    // iterative search -> O(n)
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    // Recursive Search -> O(n)
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // Check wheater the linked List is pallindrom or not
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1 jump
            fast = fast.next.next; // +2 jump
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step1 - find mid
        Node mid = findMid(head);

        // step2- reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // step3- check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // Detecting cycle in LinkedList
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // cycle exists
            }
        }
        return false; // cycle doesn't exist

    }

    // Remove cycel from LinkedList
    public static void removeCycel() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle
        prev.next = null;
    }

    public static void main(String args[]) {
        // LinkedList l1 = new LinkedList();

        // l1.addFirst(2);
        // l1.addFirst(1);
        // l1.addLast(4);
        // l1.addLast(5);
        // l1.add(2, 3);
        // l1.print();
        // // System.out.println(l1.size);
        // // l1.removeFirst();
        // // l1.print();

        // // l1.removeLast();
        // // l1.print();
        // // System.out.println(l1.size);

        // System.out.println(l1.itrSearch(3));
        // System.out.println(l1.itrSearch(10));

        // System.out.println(l1.recSearch(3));
        // System.out.println(l1.recSearch(10));

        // LinkedList l2 = new LinkedList();

        // l2.addLast(1);
        // l2.addLast(2);
        // l2.addLast(2);
        // l2.addLast(1);

        // l2.print(); // 1->2->2->1
        // System.out.println(l2.checkPalindrome());

        // Detecting cycle code
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        // 1->2->3->1
        System.out.println(isCycle());
        removeCycel();
        System.out.println(isCycle());

    }
}
