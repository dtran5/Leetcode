class Solution {
    public void deleteNode(ListNode node) {
        // take our current given node make it a copy of value of the next node
        node.val = node.next.val;
        // delete the next node by setting next equal to 2 nodes ahead
        node.next = node.next.next;
    }
}