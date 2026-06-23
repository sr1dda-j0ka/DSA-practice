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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set=new HashSet<>();
        if(head==null){
            return false;
        }
        ListNode curr=head;
        while(curr.next!=null){
            if(set.contains(curr)){
                return true;
            }else{
                set.add(curr);
                curr=curr.next;
            }
        }
        return false;
    }
}