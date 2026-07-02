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
        // if(head==null||head.next==null||k==0){
        //     return head;
        // }
        // while(k>0){
        //     ListNode curr = head;
        //     ListNode temp=curr;
        //     while(temp.next.next!=null){
        //         temp=temp.next;
        //     }
        //     ListNode last = temp.next;
        //     last.next=head;
        //     temp.next=null;
        //     head=last;
        //     k--;
        // }
        // return head;
        if(head==null||head.next==null||k==0){
            return head;
        }
        int length=1;
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
            length++;
        }
        k=k%length;
        if(k==0){
            return head;
        }
        last.next=head;
        int steps=length-k-1;
        ListNode newTail=head;
        for(int i=0;i<steps;i++){
            newTail=newTail.next;
        }
        ListNode newHead=newTail.next;
        newTail.next=null;
        return newHead;


    }
}