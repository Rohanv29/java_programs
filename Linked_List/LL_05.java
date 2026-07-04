package Linked_List;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
public class LL_05 {
    public ListNode reverseList(ListNode head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse the remaining list
        ListNode newHead = reverseList(head.next);

        // Reverse the current link
        head.next.next = head;
        head.next = null;

        // Return the new head
        return newHead;
    }
    public static void main(String[] args) {
         // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Print original list
        System.out.println("Original Linked List:");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }    
}
