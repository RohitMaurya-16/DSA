class Solution {
    public int reverse(int x) {
     
     boolean neg=x<0;    // -123   true
     
     long val=Math.abs((long)x);
     String s=Long.toString(val);
     char ch[] = s.toCharArray();

     int left=0;
     int right=s.length()-1;
  
     while(left<right)
     {
        char temp=ch[left];
        ch[left]=ch[right];
        ch[right]=temp;
        left++;
        right--;
     }

      
       String s1 = new String(ch);
       long num= Long.parseLong(s1);

     if(neg) num=-num;
     
     if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
     return 0;
      }
      return(int) num;
    }
}