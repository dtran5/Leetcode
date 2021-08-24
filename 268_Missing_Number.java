class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;

        for(int num : nums) {
            sum += num;

        }
        return total - sum;
    }
}

// nums = [3, 0, 1];
// n = 3
// total = 3 * 4 / 2
// sum = 0
// sum = 4
// total = 6
// result = 2

