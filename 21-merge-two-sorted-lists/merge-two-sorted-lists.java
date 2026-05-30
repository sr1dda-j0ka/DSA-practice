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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1); //create a dummy node
        ListNode tail=dummy; //tail will iterate 
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){ //find the smaller element
                tail.next=list1; //attach it to the tail
                list1=list1.next; //move pointer forward
            }else{
                tail.next=list2; 
                list2=list2.next;
            }
            tail=tail.next; //move tail forward
        }

        if(list1!=null) tail.next=list1; //attach remaining elements
        else tail.next=list2;

        return dummy.next; //return the head
        
    }
}