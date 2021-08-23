class Solution {
    public int removeDuplicates(int[] nums) {

        // sorted array means always compared adjacent values

        // index keeps track of where we should put the new number, if it is
        // unique
        // index 0 will always be unique, so we start on index 1
        int index = 1;

        // nums.length - 1 because we compared current index value
        // to next index value and we dont want to go out of bounds
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                // increase index so we dont overwrite on the next loop
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }
}


// nums = [1, 1, 2, 3, 3, 5]   - index = 1

// nums[1] != nums[2]
//nums[1] = nums[2]
//                             - index = 2

// nums[2] ! = nums[3];
// nums[2] = nums[3]
//                             - index = 3

// nums[4] != nums[5];
// nums[3] = num[5]
//                             - index = 4

// nums = [1, 2, 3, 5]