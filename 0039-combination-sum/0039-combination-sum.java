import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        // Start recursion with empty path and index 0
        backtrack(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int[] nums, int remaining, int index, 
                           List<Integer> currentPath, List<List<Integer>> results) {
        
        // BASE CASE: We found a combination
        if (remaining == 0) {
            // We must create a NEW ArrayList because currentPath is modified later
            results.add(new ArrayList<>(currentPath));
            return;
        }

        // BASE CASE: We overshot the target or ran out of numbers
        if (remaining < 0 || index == nums.length) {
            return;
        }

        // OPTION 1: Use the current number
        currentPath.add(nums[index]);
        // Note: We stay at 'index' because we can reuse the same number!
        backtrack(nums, remaining - nums[index], index, currentPath, results);

        // BACKTRACK: Remove the number we just added to explore other options
        currentPath.remove(currentPath.size() - 1);

        // OPTION 2: Skip the current number and move to the next one
        backtrack(nums, remaining, index + 1, currentPath, results);
    }
}
