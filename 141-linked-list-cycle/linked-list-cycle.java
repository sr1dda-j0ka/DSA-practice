/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    //Floyd's algorithm: 
    //the slow pointer moves one step ahead
    //the fast pointer moves two steps ahead
    //if there is a cycle, they both will meet else they won't 
    //O(n) time and O(1) space
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null){
            return false;
        }
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}