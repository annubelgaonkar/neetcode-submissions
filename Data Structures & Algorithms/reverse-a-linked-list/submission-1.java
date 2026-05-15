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
    public ListNode reverseList(ListNode head) {
        if(head == null)        return null;
        if(head.next == null)   return head;

        ListNode pre=null;
        ListNode curr = head;
        ListNode nextNode = null;

        while(curr!=null){
            nextNode = curr.next;
            curr.next = pre;
            pre=curr;
            curr = nextNode;
        }
        return pre;
    }
}
