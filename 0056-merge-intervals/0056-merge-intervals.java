class Solution {
    public int[][] merge(int[][] intervals) {
        // 1. Sort the intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        
        int[] curr = intervals[0];
        merged.add(curr); 
         
        for (int[] next : intervals) {
            int currEnd = curr[1];
            int nextStart = next[0];
            int nextEnd = next[1];
            
            if (currEnd >= nextStart) {
                
                curr[1] = Math.max(currEnd, nextEnd);
            } else {
                
                curr = next;
                merged.add(curr);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
}
