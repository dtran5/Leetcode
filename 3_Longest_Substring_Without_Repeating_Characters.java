class Solution {
    public int lengthOfLongestSubstring(String s) {
        // check base condition
        if (s == null || s.length() == 0) {
            return 0;
        }
        // sliding window - setup left(j) and right(i) and max
        int i = 0;
        int j = 0;
        int max = 0;
        // create hashset to store unique characters



        Set<Character> set = new HashSet<>();
        // use a while loop to check if hashset has character at i
        while (i < s.length()) {
            char c = s.charAt(i);
            if (set.contains(c)){
                // if it does, remove character from and move j up one
                set.remove(s.charAt(j));
                // do this until j lands on character not in hashset
                j++;
            }

            set.add(c);
            max = Math.max(max, i - j + 1);
            i++;

        }

        return max;
    }
}