class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        Stack<Integer> stk = new Stack<>();

        ListNode temp = head;
        ListNode prev = head;

        while (temp != null) {

            // Check if k nodes are available
            ListNode check = temp;
            int count = 0;

            while (check != null && count < k) {
                check = check.next;
                count++;
            }

            // Less than k nodes remaining
            // Leave them as they are
            if (count < k) {
                break;
            }

            // Push k nodes into stack
            for (int i = 0; i < k; i++) {
                stk.push(temp.val);
                temp = temp.next;
            }

            // Pop and update values
            while (!stk.isEmpty()) {
                prev.val = stk.pop();
                prev = prev.next;
            }
        }

        return head;
    }
}