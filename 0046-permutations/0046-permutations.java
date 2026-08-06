// FUNCTION findPermutations(nums):
//     CREATE list results to store all final permutations
//     CREATE list currentPermutation to track the current path
//     CREATE boolean array visited of size nums.length initialized to false
    
//     backtrack(nums, currentPermutation, visited, results)
//     RETURN results

// FUNCTION backtrack(nums, currentPermutation, visited, results):
//     // BASE CASE: If the current path is full, save it
//     IF currentPermutation.size EQUALS nums.length THEN
//         ADD a copy of currentPermutation to results
//         RETURN

//     // EXPLORE: Try every number for the current slot
//     FOR i FROM 0 TO nums.length - 1 DO
//         // Skip the number if it is already used in this path
//         IF visited[i] IS true THEN
//             CONTINUE
            
//         // 1. CHOOSE: Mark number as used and add to current path
//         visited[i] = true
//         ADD nums[i] to currentPermutation
        
//         // 2. EXPLORE: Move to the next slot recursively
//         backtrack(nums, currentPermutation, visited, results)
        
//         // 3. UN-CHOOSE (Backtrack): Undo choices for the next loop iteration
//         REMOVE last element from currentPermutation
//         visited[i] = false

class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> results=new ArrayList<>();
       List<Integer> currentPermutation=new ArrayList<>();
       boolean[] visited = new boolean[nums.length];
        backtrack(nums, currentPermutation, visited, results);
        return results;

    }

    public void backtrack(int[] nums, List<Integer> currentPermutation, boolean[] visited, List<List<Integer>> results)
    {
        if (currentPermutation.size() == nums.length) {
       results.add(new ArrayList<>(currentPermutation));
       return; 
       }

       for(int i=0;i<nums.length;i++)
       {
        if(visited[i]==true) continue;
        visited[i]=true;
        currentPermutation.add(nums[i]);

        backtrack(nums, currentPermutation, visited, results);
         currentPermutation.remove(currentPermutation.size() - 1);
        visited[i] = false;
       }
    }
}