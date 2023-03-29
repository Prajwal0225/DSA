import java.util.*;

public class QueueUsingJCF {
    public static void main(String args[]) {
        // Queue is an interfase so we can't create objects of it
        Queue<Integer> q = new LinkedList<>(); // we can also create Queue By using --> ArrayDeque

        // Queue<Integer> q = new ArrayDeque()<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
