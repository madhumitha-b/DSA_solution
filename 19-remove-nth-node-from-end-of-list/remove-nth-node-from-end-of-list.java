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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        Map<Integer,ListNode> mp = new HashMap<>();

        ListNode slw = head;
        int cnt = 0;

        while(slw!= null){
            mp.put(cnt,slw.next);
            cnt++;
            slw=slw.next;
        }

        if(cnt == n && n == 1)
        return null;
        int index = cnt-n;

        if(index == 0)
        {
            ListNode r = head.next;
            head.next = null;
            head=r;
            return head;
        }

       // System.out.println(index);

        ListNode prev = null;
        ListNode nxt = null;
        ListNode cur = null;

        if(mp.containsKey(index-2))
         prev = mp.get(index-2);

        if(mp.containsKey(index))
         nxt = mp.get(index);

         if(mp.containsKey(index-1))
         cur = mp.get(index-1);
        
        if(prev == null){
        head.next = nxt;
        }
        else
         prev.next = nxt;
         if(cur != null)cur.next = null;

        return head;
    }
}