
// array list method
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        // putting all of our values into an array list
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        // 2 pointer method to compare them
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {
            if (list.get(i) != list.get(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;

    }
}