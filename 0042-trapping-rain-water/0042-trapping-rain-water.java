class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1; // FIX 1: Start at the end
        int maxLeft = 0, maxRight = 0;
        int total = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    total += maxLeft - height[left]; // FIX 2: Accumulate (+=)
                }
                left++; // FIX 3: Increment every time
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    total += maxRight - height[right]; // FIX 2: Accumulate (+=)
                }
                right--; // FIX 3: Decrement every time
            }
        }
        return total;
    }
}
