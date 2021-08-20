class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];

        // keep track of x value with i
        // keep track of y value with j
        // index keeps track of location in loop
        for (int i = 0, j = n, index = 0; index < nums.length; i++, j++ ) {
            // increment index after result is set each time
            result[index++] = nums[i];
            result[index++] = nums[j];
        }

        return result;
    }
}