class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];
        
        // Loop backwards from the second-to-last day
        for (int i = n - 2; i >= 0; i--) {
            int j = i + 1;
            
            // Use the already calculated jumps in 'arr' to skip colder days quickly
            while (j < n && temperatures[j] <= temperatures[i]) {
                if (arr[j] == 0) {
                    j = n; // No warmer day exists ahead, break out
                } else {
                    j += arr[j]; // Jump directly to the next warmer day
                }
            }
            
            // If we found a warmer day within bounds, record the distance
            if (j < n) {
                arr[i] = j - i;
            }
        }
        return arr;
    }
}
