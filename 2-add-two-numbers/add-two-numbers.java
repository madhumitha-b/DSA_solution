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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;

        ListNode dummy = new ListNode();
        ListNode temp=dummy;

        while(l1 != null && l2 != null){

            int sum = l1.val + l2.val;

            if(carry != 0)
            sum=sum+carry;

            if(sum > 9){
                carry=1;
            }
            else carry = 0;
            ListNode tmp = new ListNode(sum%10);
            temp.next=tmp;
            temp=tmp;
            l1=l1.next;
            l2=l2.next;
        }

        while(l1 != null){
            int sum=l1.val;
            if(carry != 0)
                sum=sum+1;
            if(sum>9)
            carry=1;
            else
            carry=0;
            ListNode tmp = new ListNode(sum%10);
            temp.next=tmp;
            temp=tmp;
            l1=l1.next;
        }

        while(l2 != null){
            int sum=l2.val;
            if(carry != 0)
                sum=sum+1;
            if(sum>9)
            carry=1;
            else
            carry=0;
            ListNode tmp = new ListNode(sum%10);
            temp.next=tmp;
            temp=tmp;
            l2=l2.next;
        }

        if(carry != 0){
            ListNode tmp = new ListNode(1);
            temp.next=tmp;
        }

        return dummy.next;
    }
}