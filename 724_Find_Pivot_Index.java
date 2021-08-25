class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0, leftSum = 0;

        for (int num : nums) {                          // find total sum of entire array
            total+= num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) { // Looking for the exact point when leftSum = rightSum
                // total - leftSum - nums[i] (Our pivot value) gives us the target number we want
                return i;
            }

            leftSum+=nums[i];                         // keep adding until we find it
        }

        return -1;                                      // return -1 if it doesnt exist
    }
}

