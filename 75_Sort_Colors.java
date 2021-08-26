class Solution {
    public void sortColors(int[] nums) {
        // create 3 pointers - i (keep track of value), zeroIndex, twoIndex

        // index to place any zero values
        int zeroIndex = 0;

        // index to place any 2 values
        int twoIndex = nums.length - 1;

        // keep track of location during iteration
        int index = 0;

        while (index <= twoIndex) {
            // if nums value is 0
            if (nums[index] == 0) {
                // swap nums[zeroIndex] with nums[index]
                swap(nums, zeroIndex, index);
                // increment both indexes so we dont overwrite
                zeroIndex++;
                index++;
            } else if (nums[index] == 1) {
                index++;
            } else if (nums[index] == 2) {
                // swap nums[twoIndex] with nums[index];
                swap(nums, twoIndex, index);
                // decrement twoIndex
                twoIndex--;
                // index does not need to be incremented since
                // we will now compare nums[index] with a different
                // nums[twoIndex]

            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}