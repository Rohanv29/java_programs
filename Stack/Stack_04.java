package Stack;
import java.util.Stack;
public class Stack_04 {
    public static void pushAtBottom(Stack<Integer>s,int data){
        //Base Case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        //Step 1:Remove top element
        int top=s.pop();

        //Step 2:Insert at bottom
        pushAtBottom(s, data);

        //Step 3:Put removed element back
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        pushAtBottom(s, 10);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
