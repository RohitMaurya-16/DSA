// import java.util.*;

// Approach 1

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}


// Approach 2

// import java.util.*;

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n = nums.length;
//         for(int i = 0; i<n-1;i++){
//             for(int j =i+1; j<n; j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[] {i,j};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }


// Approach 3

// public class Solution
// {
//     public static int[] twoSum(int arr[],int k)
//     {
//        int left=0;
//        int right=(arr.length-1);
//        while(left<right)
//         {  
//             if(arr[left]+arr[right]==k)
//                 {
//                     return new int[] {left,right};
//                 }
//              else
//              {
//                  right--;
//              }
//              if(right==left)
//              {
//                  right=arr.length-1;
//                  left++;
//              }
//             }
//             return new int[] { };
//         }
// }


// Brute Force

// import java.util.*;
// public class TwoSum
// {
//     public static int[] twosum(int arr[],int k)
//     {
//         for(int i=0;i<arr.length;i++)
//         {
//             for(int j=i;j<arr.length;j++)
//             {
//                 if(arr[i]+arr[j]==k)
//                 {
//                     return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{ };
//     }
    
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
        
//         int arr[]={1,2,5,7,9,3};
//         int k=16;
//         System.out.println(Arrays.toString(TwoSum.twosum(arr,k)));
//     }
// }