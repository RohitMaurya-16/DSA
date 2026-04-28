class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2*nums.length];
        // for(int i=0;i<nums.length;i++)
        // {
        //     arr[i]=nums[i];
        // }
        // for(int i=0;i<nums.length;i++)
        // {
        //     arr[nums.length+i]=nums[i];
        // }
        // return arr;
       
       // Other Way to Solve

//        for(int i=0;i<nums.length;i++)
//        {
//         arr[i]=nums[i];
//         arr[nums.length+i]=arr[i];
//        }
// return arr;

//Both solution have same complexity

  // new way;
  int n=nums.length;
   System.arraycopy(nums, 0, arr, 0, n);   //(array,start of old,new array, start of copy length,what length to copy;
   System.arraycopy(nums, 0, arr, n, n);
   return arr;
    }
}