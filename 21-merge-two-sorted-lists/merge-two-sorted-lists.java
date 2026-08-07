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

     PriorityQueue<Integer> pq = new PriorityQueue<>();
     ListNode dummy = new ListNode();

     ListNode temp = dummy;

     while(list1 != null && list2 != null){

        pq.add(list1.val);
        pq.add(list2.val);

        list1=list1.next;
        list2=list2.next;
    }

    while(list1 != null){
        pq.add(list1.val);
        list1=list1.next;
    }

    while(list2 != null){
        pq.add(list2.val);
        list2=list2.next;
    }

    while(!pq.isEmpty()){

        int a =pq.poll();
        temp.next = new ListNode(a);
        temp=temp.next;
    }
    return dummy.next;
    }
}