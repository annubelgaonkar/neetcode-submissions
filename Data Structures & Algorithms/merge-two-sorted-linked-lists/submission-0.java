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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode tail=head;

        ListNode h1=list1;
        ListNode h2=list2;
        if(list1==null)     return list2;
        if(list2==null)     return list1;
        if(h1.val < h2.val){
            head=h1;
            tail=h1;
            h1=h1.next;
        }
        else {
            head=h2;
            tail=h2;
            h2=h2.next;
        }
        while(h1!=null && h2!=null){
            if(h1.val < h2.val){
                tail.next=h1;
                tail=h1;
                h1=h1.next;
            }
            else{
                tail.next=h2;
                tail=h2;
                h2=h2.next;
            }
        }
        if(h1==null){
            tail.next=h2;
        }
        if(h2==null){
            tail.next=h1;
        }
        return head;
    }
}