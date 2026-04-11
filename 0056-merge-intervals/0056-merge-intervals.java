class Solution {
    public int[][] merge(int[][] intervals) {
        // 1. Sort the intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        
        int[] curr = intervals[0];
        merged.add(curr); 
         
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i]; 
            
            if (curr[1] >= next[0]) {
                
                curr[1] = Math.max(curr[1], next[1]);
            } else {
                
                curr = next;
                merged.add(curr);
            }
        }
        
        // return merged.toArray(new int[merged.size()][]);
        return merged.toArray(new int[0][]);
    }
}
