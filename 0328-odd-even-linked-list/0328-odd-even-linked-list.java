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
    public ListNode oddEvenList(ListNode head) {

        // Original linked list ko traverse karunga aur odd positions (1st, 3rd, 5th...) wale nodes ki values new   list mein store karunga.
        // Phir dobara original linked list ko traverse karunga aur even positions (2nd, 4th, 6th...) wale nodes new list ke end mein store karunga.
        // Finally, new linked list return kar dunga

        // ListNode dummy = new ListNode(-1);
        // ListNode curr = dummy;

        // int index = 1;
        // ListNode temp = head;

     
        // while (temp != null) {

        //     if (index % 2 != 0) {
        //         curr.next = new ListNode(temp.val);
        //         curr = curr.next;
        //     }

        //     temp = temp.next;
        //     index++;
        // }

        // // Even positions
        // index = 1;
        // temp = head;

        // while (temp != null) {

        //     if (index % 2 == 0) {
        //         curr.next = new ListNode(temp.val);
        //         curr = curr.next;
        //     }

        //     temp = temp.next;
        //     index++;
        // }

        // return dummy.next;

        if (head == null) {
            return null;
        }

        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;

        while(even!=null && even.next!=null)
        {
            odd.next = even.next;
            odd = odd.next;


            even.next = odd.next;
            even=even.next;
        }

        odd.next = evenHead;



    return head;



    }
}