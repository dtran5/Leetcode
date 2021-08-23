class Solution {
    public void moveZeroes(int[] nums) {
        int snowBall = 0;

        for (int i = 0; i < nums.length; i++) {
            // if value of current element is 0
            // increment snowball by 1
            if (nums[i] == 0) {
                snowBall++;
            } else if (snowBall > 0) {
                // set temp variable equal to current element
                int temp = nums[i];
                // set current element to 0
                nums[i] = 0;
                // set nums equal to temp
                nums[i - snowBall] = temp;
            }
        }
    }
}

// nums = [0, 1, 0, 3, 12];
// snowBall = 1;
// snowBall > 0 (1 here)
// temp = nums[1] = 1;
// nums[1] = 0;
// nums[1-snowball] = nums[1 - 1] = temp(0)
// [1, 0 , 0, 3, 12];

// snowball = 2
// snowball > 0
// temp = nums[3] = 3
// nums[3] = 0;
// nums[3 - 2] = temp
// [1, 3, 0, 0, 12]