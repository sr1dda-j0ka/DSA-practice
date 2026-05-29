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
    //Time Complexity: O(n) Space Complexity: O(1)
    //Approach: traverse the list and save the next element before changing next pointer to previous
    //continue iteration
    public ListNode reverseList(ListNode head) {
        ListNode curr=head; //current element
        ListNode prev=null; //previous element
        while(curr!=null){
            ListNode next=curr.next; //next element is stored
            curr.next=prev; //replace current with previous element
            prev=curr;
            curr=next; //move to next element 
        }
        return prev; //return head of reversed list
    }
}