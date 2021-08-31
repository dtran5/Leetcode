class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentNode = head;

        // important 2 check these 2 nodes to compare to see if they are the same
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}