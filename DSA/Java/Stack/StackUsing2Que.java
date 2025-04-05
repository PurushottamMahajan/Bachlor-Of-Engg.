package Stack;

    

import java.util.LinkedList;
import java.util.Queue;
public class StackUsing2Que {

Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsing2Que stack = new StackUsing2Que();
        stack.push(10);
        stack.push(20);
        System.out.println("Top: " + stack.top()); // 20
        System.out.println("Popped: " + stack.pop()); // 20
    }
}
