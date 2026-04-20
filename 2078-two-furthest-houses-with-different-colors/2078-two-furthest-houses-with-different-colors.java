class Solution {
    public int maxDistance(int[] arr) {
        int n = arr.length;
        int maxDist = 0;

        for (int i = 0; i < n; i++) {
            // Compare with the first element
            if (arr[i] != arr[0]) {
                maxDist = Math.max(maxDist, i);
            }
            // Compare with the last element
            if (arr[i] != arr[n - 1]) {
                maxDist = Math.max(maxDist, (n - 1) - i);
            }
        }
        
        return maxDist;
    }
}
