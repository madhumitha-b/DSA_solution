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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head==null||head.next == null)
        return head;

        Stack<Integer> stk=new Stack<>();
        ListNode str=head;
        int cnt=1;

        while(cnt<left){
            cnt++;
            str=str.next;
        }

        while(cnt<=right){
            stk.push(str.val);
            str=str.next;
            cnt++;
        }

        str=head;
        cnt=1;

        while(cnt<left){
            cnt++;
            str=str.next;
        }

        while(!stk.isEmpty()){
            str.val=stk.peek();
            stk.pop();
            str=str.next;
        }
        return head;
    }
}