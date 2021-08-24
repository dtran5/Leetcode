// Time Complexity: O(n)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // create 2 hash sets

        Set<Integer> set = new HashSet<>();

        // first one adds unique characters of nums1
        for (int num : nums1) {
            set.add(num);
        }

        Set<Integer> intersection = new HashSet<>();

        // second adds nums2 values if its in nums1
        for (int num : nums2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        // handle returned array, size of intersection
        int[] result = new int[intersection.size()];
        int index = 0;
        for (int i : intersection) {
            result[index++] = i;
        }

        return result;

    }

}

// optimized with only 1 hashset
// Time Complexity: O(nlogn)

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(num2);

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums[i] < nums[j]) {
                i++;
            } else if (nums[i] > nums[j]) {
                j++
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] result = new int[set.size()];
        int k = 0;
        for (int i : set) {
            result[k++] = i;
        }

        return result;
    }
}