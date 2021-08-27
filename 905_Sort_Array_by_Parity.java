class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int index = 0;
        for (int i = 0; i<nums.length;i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[index];
                nums[index] = nums[i];
                index++;
                nums[i] = temp;
            }
        }

        return nums;
    }
}

// Two pointer approach

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // 2 pointers
        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;
            } else if (nums[j] % 2 == 1) {
                j--;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        return nums;
    }
}

/*
[3, 1, 2, 4]

index=0

nums[2] = 2;
temp = nums[0] = 3
nums[0] = 2;
index=1
nums[2] = 3

index=1

temp = nums[1] = 1
nums[1] = 4
index=2
nums[3] = 1


*/
