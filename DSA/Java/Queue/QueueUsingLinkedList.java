package Queue;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Queue after enqueues:");
        queue.display();

        // Dequeue one element
        queue.dequeue();
        System.out.println("Queue after one dequeue:");
        queue.display();

        // Enqueue more elements
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Queue after more enqueues:");
        queue.display();

        // Dequeue all elements
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println("Queue after all dequeues:");
        queue.display();
    }
}

class Node {
    int data;
    Node next;
}

class LinkedQueue {
    Node front, rear;

    void enqueue(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Deleted: " + front.data);
        front = front.next;
        if (front == null) rear = null;
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
