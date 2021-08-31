class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous = null;

        while (head != null) {
            ListNode recordNextNode = head.next;
            head.next = previous;
            previous = head;
            head = recordNextNode;

        }

        return previous;
    }
}