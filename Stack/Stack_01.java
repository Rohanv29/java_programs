package Stack;

public class Stack_01 {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    static class Stack{
        public Node head;
        public boolean isEmpty(){
            return head==null;
        }
        public void Push(int val) {
            Node newnode=new Node(val);
            if(isEmpty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top=head.val;
            head=head.next;
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=head.val;
            head=head.next;
            return top;
        }
        public void Display(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();

    s.Push(10);
    s.Push(20);
    s.Push(30);

    s.Display();          // 30 20 10

    System.out.println(s.pop()); // 30

    s.Display();          // 20 10

    System.out.println(s.peek()); // 20
    }
    
}
