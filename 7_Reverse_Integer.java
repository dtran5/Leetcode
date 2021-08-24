class Solution {
    public int reverse(int x) {
        // track negative number and convert to positive for now
        boolean negative = false;
        if (x < 0) {
            negative = true;
            x *= -1;
        }

        long reversed = 0;

        while (x > 0) {
            // multiply by 10 to get the number to the tens, hundreds, etc
            // modulus 10 gets the last number and adds to reversed
            reversed = (reversed * 10) + (x % 10);
            // divide by 10 removes the last digit
            // 54321 / 10 = 5432
            x /= 10;
        }

        // if our number is too big
        if (reversed > Integer.MAX_VALUE) {
            return 0;
        }

        // convert back to int and add back in negative if needed
        return negative ? (int)(reversed * -1) : (int)(reversed);
    }
}