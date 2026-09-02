class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; 
        ListNode curr = head; 
        
        while (curr != null) {
            ListNode next = curr.next; //  Temporarily store the next node
            curr.next = prev;          //  Reverse the current node's pointer
            prev = curr;               //  Move prev forward to the current node
            curr = curr;               //  Move curr forward to the next node
        }
        
        return prev; // prev will be pointing to the new head of the reversed list
    }
}
