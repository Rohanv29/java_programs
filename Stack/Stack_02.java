package Stack;

import java.util.ArrayList;

// Stack using ArrayList
public class Stack_02 {
    static class Stack{
        ArrayList<Integer>list=new ArrayList<>();
        public boolean isEmpty(){
            return list.isEmpty();
        }
        public void push(int data){
            list.add(data);
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(top);
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }
        public void display(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);

    s.display();

    System.out.println("Top = "+ s.peek());

    System.out.println("Popped = "+s.pop());

   
    }
    
}
