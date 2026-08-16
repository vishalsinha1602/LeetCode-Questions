/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode abhiKaValue = head;

         while (abhiKaValue != null && abhiKaValue.next != null)
         {
            if(abhiKaValue.val==abhiKaValue.next.val){
                abhiKaValue.next=abhiKaValue.next.next;
            }

            else
            {
                abhiKaValue=abhiKaValue.next;
            }

           
         }
        
    return head;
        
    }     
    
}