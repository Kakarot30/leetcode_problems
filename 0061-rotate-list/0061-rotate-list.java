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
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode tail = head;
        int count =1;
        while(tail.next!=null){
            tail=tail.next;
            count++;
        }
        k=k%count;
        if(k==0){
            return head;
        }
        // make it circular
        tail.next=head;

        int steps = count-k;
        ListNode newTail= head;

        for(int i=1;i<steps;i++){
            newTail = newTail.next;
        }
        // new head [4]
        ListNode newHead = newTail.next;
        // break the cycle
        newTail.next=null;

        return newHead;
    }

}