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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list1=new ArrayList();
        ArrayList<Integer> list2=new ArrayList();
        if(head==null){
            return false;
        }
        ListNode temp1=head;
        while(temp1!=null){
            list1.add(temp1.val);
            temp1=temp1.next;
        }
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode tempNext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tempNext;
        }
        ListNode temp2=prev;
        while(temp2!=null){
            list2.add(temp2.val);
            temp2=temp2.next;
        }
        if(list1.equals(list2)){
            return true;
        }
        else{
            return false;
        }

    }
}