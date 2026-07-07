package Queue;
// Queue using Array
public class Queue_01 {
    int arr[];
    int size;
    int front;
    int rear;

    public Queue_01(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    public void enqueue(int data){
        if(rear == size-1){
            System.out.println("Queue Overflow");
            return;
        }
        if(front == -1){
            front =0;
        }
        rear++;
        arr[rear]=data;

    }
    public int dequeue(){
        if(front ==-1){
            System.out.println("Queue Underflow");
            return -1;
        }
        int value=arr[front];
        if(front ==rear){
            front =rear=-1;
        }
        else{
            front++;
        }
        return value;

    }
    public int peek(){
        if(front == -1){
            return -1;
        }
        return arr[front];

    }
    public void display(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front;i<=rear;i++){
            System.out.println(arr[i]+ " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Queue_01 q=new Queue_01(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        System.out.println("Removed element is " + q.dequeue());
        q.display();
        System.out.println("Front element is " + q.peek());
    }
}
