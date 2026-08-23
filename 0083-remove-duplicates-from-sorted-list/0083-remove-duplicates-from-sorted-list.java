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
    public ListNode deleteDuplicates(ListNode head) {
        TreeSet<Integer>mp=new TreeSet();
        ListNode temp=head;
        while(temp!=null){
            mp.add(temp.val);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int x:mp){
            curr.next=new ListNode(x);
            curr=curr.next;
        }
        return dummy.next;
    }
}