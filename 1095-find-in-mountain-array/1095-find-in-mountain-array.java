class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        // find peak
        int peak = Peak(mountainArr, n);

        // search in ascending part
        int Try = binarySearch(mountainArr, target, 0, peak, true);

        if (Try != -1) return Try;

        // search in descending part
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    public static int Peak(MountainArray mountainArr, int n) { //here finding peak element from where array breakes 
        int low = 0;
        int high = n - 1;
        int peak = 0;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mountainArr.get(mid) < mountainArr.get(mid + 1))
                low = mid + 1;
            else
                high = mid;

            peak = low;   // at this palace mid element and low elemnt both will be same so you can use low and mid both
        }
        return peak;
    }

    public int binarySearch(MountainArray mountainArr, int target, int low, int high, boolean asc) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mountainArr.get(mid) == target) return mid;

            if (asc) {   // if true it mean you are searching in increasing half...
                if (mountainArr.get(mid) > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {  //  in decreasing half////
                if (mountainArr.get(mid) > target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; // return -1 no element find
    }
}