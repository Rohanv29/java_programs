package Linked_List;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class LL_06 {
    public Node RemoveNthEle(Node head,int n){
        if( head==null || head.next==null ){
            return null;
        }
        int size=0;
        Node curr=head;
        while (curr != null) {
            curr=curr.next;
            size++;
        }
        if(n == size){
            return head.next;
        }
        int idxSearch = size - n;
        Node prev = head;
        for (int i = 1; i < idxSearch; i++) {
            prev = prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
    public static void main(String[] args) {
         // Create linked list: 1 -> 2 -> 3 -> 4
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
         // Print original list
        System.out.println("Original Linked List:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        LL_06 obj = new LL_06();
        head = obj.RemoveNthEle(head, 2);
        System.out.println("Original Linked List:");
        Node temp2 = head;
        while (temp2 != null) {
            System.out.print(temp2.val + " ");
            temp2 = temp2.next;
        }
        
    }
    
}
