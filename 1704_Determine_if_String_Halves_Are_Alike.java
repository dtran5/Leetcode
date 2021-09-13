class Solution {
    public boolean halvesAreAlike(String s) {
        var vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int count1 = 0, count2 = 0;

        // setup our 2 points to loop through string
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            // count1 tracks first half
            count1 += vowels.contains(s.charAt(i)) ? 1 : 0;
            // count2 tracks second half
            count2 += vowels.contains(s.charAt(j)) ? 1 : 0;
        }

        return count1 == count2;
    }
}

 