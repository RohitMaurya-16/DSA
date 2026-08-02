class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        char ch[]=s.toCharArray();
         boolean bool=true;
         int right=ch.length-1;
         int left=0;
         while(left<right)
         {
            if(ch[left]!=ch[right]){
                bool=false;
                
            }
                left++;
                right--;
         }

         return bool;
    }
}