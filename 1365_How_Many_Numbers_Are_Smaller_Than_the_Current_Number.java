
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] bucket = new int[101];

        for (int i = 0; i < nums.length; i++) {
            // map each number in nums to the correct position in bucket
            // this stores a count for each number in nums, not the actual number               itself
            bucket[nums[i]] += 1;
        }

        // iterates through bucket array, making the current element we are on
        // equal to the current elements value + everything previous to it

        // bucket = [0, 1, 2, 1, 0, 0 ...]
        // then complete below loop
        // bucket = [0, 1, 3, 4, 4, 4 ...]

        for (int j = 1; j<=100;j++) {
            bucket[j] += bucket[j - 1];
        }

        // loop through original nums array
        // get the index from bucket corresponding the value of the number from
        // nums - 1 (minus one because without it we also get the ones equal to it
        // and we only want smaller
        // assign the result as the new value in the nums array instead of
        // creating a new array. Also if value is 0 we automatically return 0 as
        // no element can be smaller than it.

        for (int k = 0; k <nums.length; k++) {
            int positionInBucket = nums[k];
            nums[k] = positionInBucket == 0 ? 0 : bucket[positionInBucket - 1];
        }


        return nums;
    }

}


// nums = [4, 1, 2, 2, 3]
// bucket = [0, 1, 2, 1, 1, 0, 0, 0 ...]
// bucket = [0, 1, 3, 4, 5, 5, 5, 5, ...]
// nums = [4, 0, 1, 1, 3]