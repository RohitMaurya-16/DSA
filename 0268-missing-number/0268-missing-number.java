class Solution {
    public int missingNumber(int[] nums) {
        
//         Arrays.sort(nums);
//         int a=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             int k=nums[i];
//             if(k==a)
//             {
//              a++;
//             }
//             else
//             {
//                 return a;
//             }
     
//        }  
//     return nums.length; }
// }

// The above code is not optimal so lets do optimal code


   int n=nums.length;
   int sum=n*(n+1)/2;
   int acc=0;

   for(int i=0;i<n;i++)
   {
      acc+=nums[i];
   }

   return (sum-acc);
    }
}