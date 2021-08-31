class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        // when fast reaches the end, the slow will be in the center
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast =fast.next.next;
        }

        return slow;
    }
}