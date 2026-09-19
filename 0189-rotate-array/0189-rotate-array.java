class Solution {
    public int[] rotate(int[] nums, int k) {
        int n=nums.length;
        int arr[]= new int[n];
        k=k%n;
        for(int i=0;i<n;i++)
        {
             int a=(k+i)%n;
             arr[a]=nums[i];

        }

        for(int i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }
        return nums;
     }
    }