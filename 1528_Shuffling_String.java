class Solution {
    public String restoreString(String s, int[] indices) {
        char[] lettersArranged = new char[s.length()];

        for (int i = 0; i < lettersArranged.length; i++) {
            lettersArranged[indices[i]] = s.charAt(i);
        }

        return new String(lettersArranged);
    }
}