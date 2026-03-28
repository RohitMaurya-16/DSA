class Solution {
    public int threeSumClosest(int[] nums, int target) {
    int n=nums.length;
    Arrays.sort(nums);
    int k=nums[0]+nums[1]+nums[2];
    for(int i=0;i<n-2;i++)
    {
        int left=i+1;
        int right=n-1;
        while(left<right)
        {
            int sum=nums[i]+nums[left]+nums[right];
            {
                if(Math.abs(target-sum)<Math.abs(target-k))
                {
                    k=sum;
                }
                if(sum<target)
                {
                    left++;
                }
                else if(sum>target)
                {
                    right--;
                }
                else
                {
                    return sum;
                }
            }
        }
    }
    return k;
    }
}


// Here is a condensed, "cheat-sheet" version of the notes for the 3Sum Closest problem:
// 1. The Goal
// Find three numbers in an array whose sum is nearest to a given target. Return that sum.
// 2. Essential Steps
// Sort: You must sort the array first (




// ). This allows the Two-Pointer logic to work.
// Fix One: Use a for loop to fix the first number (i).
// Two Pointers: Use left (at i + 1) and right (at end) to find the other two numbers.
// 3. The Math (Distance)
// Math.abs(target - sum): This is the "gap" or distance.
// Update Rule: If new_gap < old_gap, update your closestSum.
// Example: If target is 10, a sum of 13 (gap 3) is better than a sum of 6 (gap 4).
// 4. Pointer Movement (The "Why")
// Move pointers based on the Target, not the previous best sum:
// sum < target: You need a bigger number 
//  left++.
// sum > target: You need a smaller number 
//  right--.
// sum == target: You found the perfect match 
//  return sum.
// 5. Complexity
// Time: 



//  — One loop (i) and one pointer scan (left/right) inside it.
// Space: 



//  — Only a few variables are stored.
// 6. Quick Tip
// Initialize your closestSum with nums[0] + nums[1] + nums[2]. This avoids "Overflow Errors" that can happen if you use Integer.MAX_VALUE.