import java.util.LinkedList;

import CircularQueueUsingArray.Queue;

public class ReversingfirstKelementsofQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        Stack<Integer>s = new Stack<Integer>();
        
        for(int i = 0;i<k;i++){
            s.add(q.remove());
        }
        int rem = q.size() - k;
        
        for(int l = 0;l<k;l++){
            q.add(s.pop());
        }
        while(k < q.size()){
        q.add(q.remove());
        k++;
        }
        
        
        return q;
    }

    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();

        q.add(3);
        q.add(2);
        q.add(1);
        q.add(4);
        q.add(5);
    }
}
