/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

    // 1 2 3 4 5 => nod=3
    // 1 2 (3.val = 4 and 3.next = 3.next.next)=>4 5 
      node.val= node.next.val;
      node.next = node.next.next;

    }
}