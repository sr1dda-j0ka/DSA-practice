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
    //Time Complexity: O(n) Space complexity: O(1)
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){ 
            return head; //cases where head or head.next is null 
        }
        ListNode oddPointer=head; //initialise oddPointer
        ListNode evenPointer=head.next; //initialise evenPointer
        ListNode evenHead=head.next; //save head of even list 
        while(evenPointer!=null && evenPointer.next!=null){
            oddPointer.next=oddPointer.next.next; //connect odd node to the next odd node
            oddPointer=oddPointer.next;//oddPointer is moved to the next odd node
            evenPointer.next=oddPointer.next;//connect even pointer to the next even node
            evenPointer=evenPointer.next; //move even pointer
        }
        oddPointer.next=evenHead;
        return head;
    }
}