package Queue;
import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue
    public void enqueue(int data) {
        stack1.push(data);
    }

    // Dequeue
    public int dequeue() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Peek
    public int peek() {

        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println(q.dequeue());
    }
}