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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        if(head==null){
            return head;
        }
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        int index=size/2;
        temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
        
    }
}