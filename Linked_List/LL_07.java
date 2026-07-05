package Linked_List;

public class LL_07 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to check if Linked List is Palindrome
    public static boolean isPalindrome(ListNode head) {

        // Empty list or single node
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        ListNode prev = null;

        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Step 3: Compare first half and second half
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            if (first.val != second.val) {
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {

        // Create Linked List: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        if (isPalindrome(head)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}


// BRUTE FORCE
//    public static boolean isPalindrome(ListNode head) {

//         ArrayList<Integer> list = new ArrayList<>();

//         while (head != null) {
//             list.add(head.val);
//             head = head.next;
//         }

//         int left = 0;
//         int right = list.size() - 1;

//         while (left < right) {

//             if (!list.get(left).equals(list.get(right))) {
//                 return false;
//             }

//             left++;
//             right--;
//         }

//         return true;
//     }