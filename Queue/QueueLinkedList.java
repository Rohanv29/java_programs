package Queue;

public class QueueLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Enqueue (Insert)
    public void enqueue(int data) {

        Node newNode = new Node(data);

        // If queue is empty
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue (Delete)
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;

        front = front.next;

        // If queue becomes empty
        if (front == null) {
            rear = null;
        }

        return value;
    }

    // Peek
    public int peek() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        return front.data;
    }

    // Display
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        QueueLinkedList q = new QueueLinkedList();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Removed: " + q.dequeue());

        q.display();

        System.out.println("Front: " + q.peek());
    }
}