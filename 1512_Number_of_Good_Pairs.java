class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int i : nums) {
            if (map.containsKey(nums[i])) {
                int temp = map.get(nums[i]);
                count += temp;  // add number of occurrences to the answer
                map.put(nums[i], count + 1); // increment number of occurrences
            } else {
                map.put(nums[i], 1); // if it is the first time, add it to the map
            }
        }

        return count;
    }
}

// We are esentially tasked with finding the number of repeats after first occurence of each number.
// Here's a way to visualize it. If I have [1,1], then there is only 1 "good pair,"
// which is the first and second 1. (0+1 = 1)
//If I have [1,1,1] then there are 3 "good pairs" ([first,second], [second,third,], [first,third]).
// The first 1 has 0 pairs, the second 1 has 1 pair, and the third 1 has 2 pairs. (0+1+2 = 3)!
//Likeswise for [1,1,1,1] there are 6 "good pairs" (0+1+2+3 = 6)
//From this, we can conclude the pattern is for every subsequent repeat of a number,
// the number of combinations increases by the current number of appearances of that number.