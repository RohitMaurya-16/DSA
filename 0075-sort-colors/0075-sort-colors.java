class Solution {
    public int[] sortColors(int[] nums) {
        // Arrays.sort(nums);
        // return nums;

        // Above one is simple approach-->Dont use it..
     
       int arr[]=new int[3];  //  [0,1,2]
       Arrays.fill(arr, 0);

       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
        {
            arr[0]=arr[0]+1;
        }
        else if(nums[i]==1)
        {
            arr[1]=arr[1]+1;
        }
        else
        {
            arr[2]=arr[2]+1;
        }
       }
        
        // new array look like this   as per example 1:  arr=[2,2,2];

        for(int i=0;i<arr[0];i++)
        {
          nums[i]=0;
        }

         for(int i=arr[0];i<arr[0]+arr[1];i++)
        {
          nums[i]=1;
        }

         for(int i=arr[0]+arr[1];i<arr[0]+arr[1]+arr[2];i++)
        {
          nums[i]=2;
        }
  return nums;
    }
}