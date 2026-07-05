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
        //Use three pointers prev, curr
        //everytime, temp stores the next value, curr is pointed towards prev and prev becomes curr
        //curr moves to next value stored in temp
        if(head==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode tempNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tempNext;
        }
        return prev;
    }
}