class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int idx = Arrays.binarySearch(nums, target);
        if(idx>=0)
        return idx;
        else
        return -1;
    }
}