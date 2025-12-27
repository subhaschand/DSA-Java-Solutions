


class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    public ListNode(int i, ListNode head) {
      //TODO Auto-generated constructor stub
    }
}

public class ReverseLinkedList {
    /**
     * Problem: Reverse a singly linked list.
     * Strategy: Iterative approach using 3 pointers (prev, curr, next).
     * Time Complexity: O(n)
     * Space Complexity: O(1) - In-place reversal.
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextTemp = curr.next; // Save next node
            curr.next = prev;              // Reverse the pointer
            prev = curr;                   // Move prev forward
            curr = nextTemp;               // Move curr forward
        }
        return prev;
    }
}
