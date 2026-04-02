class Solution {
     public static boolean palindrom(String s)
        {
            int left=0;
            int right=s.length()-1;
            while(left<right)
            {
                if(s.charAt(left)!=s.charAt(right))
                {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
    
    public String longestPalindrome(String s1) {
     String s3="";
     for(int i=0;i<s1.length();i++)
      {
        int left=i;
        int right=s1.length()-1;
        // String s="";
        while(right>=left)
        {
          String s=s1.substring(left,right+1);
        if(palindrom(s))
        {
            if(s.length()>s3.length())
            {
                s3=s;
            }
        }
        right--;
      }
    }
     return s3;
    }
}