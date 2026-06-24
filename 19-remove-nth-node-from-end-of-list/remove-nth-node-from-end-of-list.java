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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int indx=size-n;
        if(indx==0){
            return head.next;
        }
        ListNode pointer=head;
        for(int i=0;i<indx-1;i++){
            pointer=pointer.next;
        }
        pointer.next=pointer.next.next;
        return head;
    }
}