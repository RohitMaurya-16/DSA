class Solution {
    public int findNumbers(int[] nums) {
        if (nums.length==0) return 0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            String s=Integer.toString(n);
            char[] arr=s.toCharArray();
            int a=arr.length;
            if(a%2==0)c++;

        }
        return c;
    }
}