package Queue;

public class CircularQueue {

    int arr[];
    int size;
    int front;
    int rear;

    // Constructor
    public CircularQueue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Enqueue (Insert)
    public void enqueue(int data) {

        // Queue Full
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
            return;
        }

        // First element
        if (front == -1) {
            front = rear = 0;
            arr[rear] = data;
            return;
        }

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    // Dequeue (Delete)
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = arr[front];

        // Only one element
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return value;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    // Display Queue
    public void display() {

        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(arr[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % size;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());

        q.display();

        q.enqueue(60);
        q.enqueue(70);

        q.display();

        System.out.println("Front Element: " + q.peek());
    }
}