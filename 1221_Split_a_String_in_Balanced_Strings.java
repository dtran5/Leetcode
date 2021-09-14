class Solution {
    public int balancedStringSplit(String s) {
        char[] letters = s.toCharArray();

        // gets the sum of a balanced right and left
        int sumOfRL = 0;
        // counts the number of balanced strings
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // if letters equals 'R' then add 1 otherwise subtract 1
            // this works because string is always balanced
            sumOfRL += letters[i] == 'R' ? 1 : -1;

            // if our sum is 0 then it means we have balance so we count it
            if (sumOfRL == 0) {
                count+=1;
            }
        }

        return count;
    }
}