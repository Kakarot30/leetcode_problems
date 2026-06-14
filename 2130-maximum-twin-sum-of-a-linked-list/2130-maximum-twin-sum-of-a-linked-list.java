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
    public int pairSum(ListNode head) {
        int n = length(head);
        int[] arr1 = new int[n/2];
        int[] arr2 = new int[n/2];
        ListNode temp = head;
        for(int i=0;i<=(n/2)-1;i++){
            arr1[i]=temp.val;
            temp=temp.next;
        }
        for(int i=(n/2)-1;i>=0;i--){
            arr2[i]=temp.val;
            temp=temp.next;
        }
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n/2;i++){
        
            max = Math.max(max,arr1[i]+arr2[i]);

        }

        return max ;
    }
    private int length(ListNode head){
        ListNode temp = head;
        int count =1;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}