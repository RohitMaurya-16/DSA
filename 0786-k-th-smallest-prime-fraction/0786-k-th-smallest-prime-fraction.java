class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double low = 0.0;
        double high = 1.0;
        
        // Binary search for the fractional value itself
        while (low < high) {
            double mid = low + (high - low) / 2;
            
            // Track total count of fractions <= mid
            int totalFractions = 0; 
            int p = 0; // Stores numerator of the maximum fraction <= mid
            int q = 1; // Stores denominator of the maximum fraction <= mid
            int j = 1; // Right pointer for the denominator
            
            // Two-pointer sweep to count valid fractions
            for (int i = 0; i < n - 1; i++) {
                while (j < n && arr[i] > mid * arr[j]) {
                    j++;
                }
                
                // All fractions from index j to n-1 are <= mid
                totalFractions += (n - j);
                
                // If we found a valid fraction, check if it's the largest one seen so far
                if (j < n && arr[i] * q > p * arr[j]) {
                    p = arr[i];
                    q = arr[j];
                }
            }
            
            // Check if we hit exactly k elements
            if (totalFractions == k) {
                return new int[]{p, q};
            }
            
            // Adjust search boundaries
            if (totalFractions < k) {
                low = mid; // Look for larger values
            } else {
                high = mid; // Look for smaller values
            }
        }
        
        return new int[]{};
    }
}
