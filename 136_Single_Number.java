import java.util.HashMap;
import java.util.Map.Entry;
// first attempt
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], count+=1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
            }
        }

        return result;
    }
}

// optimized constant space
public int singleNumber(int[] nums) {
    int result = 0;


    for(int i=0;i < nums.length;i++)
        result ^= nums[i];

    return result;

}

// nums = [1, 2, 1, 2, 4]
// if you XOR the same element
    // 1 ^ 1 = 0
    // 2 ^ 2 = 0
    // 1 ^ 0 = 1
    // 0 ^ 1 = 1

// traverse array
// 1 ^ 1 = 0
// 2 ^ 2 = 0
// 4 ^ 0 = 4
    // return result which equals 4
