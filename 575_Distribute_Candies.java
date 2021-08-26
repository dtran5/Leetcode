class Solution {
    public int distributeCandies(int[] candyType) {
        // create hashset to get unique values
        Set<Integer> set = new HashSet<>();

        // loop through nums and add unique values to set
        // set is smart enough to know if its already in there
        for (int candy : candyType) {
            set.add(candy);
        }

        int maxNumOfCandy = candyType.length / 2;
        // get size of hashset
        int uniqueCandy = set.size();

        // if she can eat more candy than there are unique kinds then she can eat all of them
        // return all of the unique candies
        if (maxNumOfCandy > uniqueCandy) {
            return uniqueCandy;
        } else {
            // otherwise she can just eat the prescribed amount
            // return max num of candy she can eat;
            return maxNumOfCandy;
        }
    }
}