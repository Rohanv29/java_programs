package Queue;
import java.util.*;

public class Queue_02 {
    public static void main(String[] args) {
        // there is LL becase object is alwys made with class not with interface and queue is a interface abd linked list is a class.
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
         System.out.println(q);
        


    }    
}
// import java.util.ArrayDeque;
// import java.util.Queue;

// public class QueueDemo {
//     public static void main(String[] args) {

//         Queue<Integer> q = new ArrayDeque<>();

//         q.offer(1);
//         q.offer(2);
//         q.offer(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.poll());
//         }
//     }
// }
