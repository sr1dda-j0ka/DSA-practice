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
    //Point fast and slow to a dummy node before head
    //Move fast t times
    //Move slow and fast together till fast reaches end of the list
    //Slow is right before the node to be deleted, delete the next node and return dummy.next
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0,head);
        ListNode slow=dummy;
        ListNode fast=dummy;
        for(int i=0;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}