class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (values.containsKey(difference)) {
                return new int[] {values.get(difference), i};
            } else {
                values.put(nums[i], i);
            }


        }

        return new int[]{-1, 1};
    }
}