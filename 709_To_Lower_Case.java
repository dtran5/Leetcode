class Solution {
    public String toLowerCase(String s) {
        // convert string to array
        char[] letters = s.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            // if the letter we are on is between or equal to A and Z
            // then it is a capital letter
            // ASCII table 'A' is 65 and 'Z' is 90
            if ('A' <= letters[i] && letters[i] <= 'Z') {
                // subtract 'A' is current letter - 65 to get it to null or if you're on 'B' its gets
                // you to null + 1 so when you add 'a' is gets the lowercase version of the letter you're on
                // convert from int to char
                letters[i] = (char) (letters[i] - 'A' + 'a');

            }

        }

        // return the array as string form
        return new String(letters);
    }
}