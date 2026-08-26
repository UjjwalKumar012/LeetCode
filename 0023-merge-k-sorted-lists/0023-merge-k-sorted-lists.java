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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode l : lists){
           if(l != null) {
            pq.add(l);
           }
        } 
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while(pq.isEmpty() == false){
            ListNode n = pq.poll();
            temp.next = n;
            temp = temp.next;
            if(n.next != null){
                pq.add(n.next);
            }
        } 
        return ans.next;  
            }
}