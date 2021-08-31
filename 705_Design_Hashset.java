/*
* Assumptions:
*   values will be in range [0, 1000000]
*   number of operations will be in range of [1, 10000]
*   do not used built in hashset library
* */


// Actually implement a hashset
/*
 * create fixed set of buckets
 * map range of inputs to buckets
 * handle collisions, use a list for each buckets
 * */
class Hashset {
    // set our max value to highest range value
    private final int MAX_VALUE = 1000000;
    // set our bucket size (this can be anything but we use 100 to make it easy)
    private final int ARRAY_SIZE = 100;
    // parent list is our list of linked list - stores our buckets which stores its own linked list
    private List<List<Integer>> parentList;

    public myHashSet() {
        // initialize our data structure (array list)
        // forcing our parentlist to size 100 elements
        // each element in parentList will be a linked list
        parentList = new ArrayList<>(ARRAY_SIZE);
        // make each element in parentList as null to ensure we have 100 elements in array list
        for (int i = 0; i < parentList; i++) {
            parentList.add(null);
        }
    }

    public void add(int key) {
        // map our key input to one of the 100 buckets in parent list
        int index = key % ARRAY_SIZE;
        // get the list in that bucket we mapped to
        List<Integer> childList = parentList.get(index);
        // no one has been there yet, need to initialize a new linked list
        // add our key to that list and set it up to the bucket we got
        if (childList == null) {
            List<Integer> list = new LinkedList<>();
            list.add(key);
            parentList.set(index, list);
        } else {
            // if linked list already there, then just need to append it to list
            // only if list doesnt already contain that value
            if (!childList.contains(key)) {
                childList.add(key);
            }
        }
    }

    public void remove(int key) {
        // find the bucket
        int index = key % ARRAY_SIZE;
        // get list at this index
        List<Integer> childList = parentList.get(index);
        if (childList != null) {
            // if key is 5
            // need to convert integer because we dont want to remove the 5th element but we
            // want to remove the element 5 itself in the child list
            // if no linked list, nothing to remove
            childList.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {
        // find bucket
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        return childList != null && childList.contains(key);
    }
}
// array method
class Hashset {

    // initialize data structure here
    // use our own data structure to hold our data
    boolean[] nums;
    public myHashSet() {
        // create array set to range + 1 because its 0 indexed
        // store boolean value at each index
        nums = new boolean[10000001];
    }
    // whats the data type i need to track? here its an int
    public void add(int key) {
        // to mark as added, mark true
        nums[key] = true;
    }

    public void remove(int key) {
        nums[key] = false;
    }

    public boolean contains(int key) {
        return nums[key];
    }
}

