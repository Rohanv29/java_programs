package Linked_List;

// Reverse a Linked List

class ListNode {
    int val;
    Node next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LL_04 {

    public Node ReverseLL(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
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

        // Reverse the list
        LL_04 obj = new LL_04();
        head = obj.ReverseLL(head);

        // Print reversed list
        System.out.println("\nReversed Linked List:");
        temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}