/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
   
    int low = 1, high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;       
            } else {
                low = mid + 1;
            }
        }

        return low;   // At the end mid and low will be same but we cannot retun mid because it has only local scope...
    }
}