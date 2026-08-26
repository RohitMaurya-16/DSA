
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return n;
        }

        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n - 1; i++) {
            int diff = nums[i + 1] - nums[i]; 
            if (diff != 0) {
                list.add(diff);
            }
        }

        if (list.isEmpty()) {
            return 1;
        }

        int count = 2; 
        boolean bool = list.get(0) < 0; 

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > 0 && bool) {
                count++;
                bool = false; 
            } 
            else if (list.get(i) < 0 && !bool) {
                count++;
                bool = true; 
            }
        }

        return count; 
    }
}
