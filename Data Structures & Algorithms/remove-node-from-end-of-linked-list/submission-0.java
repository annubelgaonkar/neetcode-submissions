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
    public int sizeOfll(ListNode head){
        ListNode temp = head;
        int len=0;
        while(temp != null){
            len++;
            temp=temp.next;
        }
        return len;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = sizeOfll(head);
        int b = size-n;
        if(n >= size){
            return head.next;
        }
       ListNode temp = head;
       int i=1;
       while(i<b){
        temp=temp.next;
        i++;
       }
       temp.next=temp.next.next;
       return head;
    }
}
