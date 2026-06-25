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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        temp.next=head;
        if(k>=size){
            k=k%size;
        }
        ListNode cut=head;
        for(int i=0;i<size-k-1;i++){
            cut=cut.next;
        }
        ListNode ans=cut.next;
        cut.next=null;
        return ans;

    }
}