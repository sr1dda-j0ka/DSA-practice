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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode node=dummy;
        if(head==null){
            return head;
        }
        while(true){
            ListNode first=node.next;
            if(first==null) return dummy.next;
            ListNode second=first.next;
            if(second==null) return dummy.next;
            ListNode secondNext=second.next;
            second.next=first;
            first.next=secondNext;
            node.next=second;
            node=first;
        }
    }
}