class Solution {
    public int reverse(long x) {
     
    /*    

    Before going to code you should know;

    String s = Long.toString(val);   // Converts long val into String s;
    char[] ch = s.toCharArray();    // Conver string to array

    exmaple:

    val=1234---> s="1234"---> ch=[1,2,3,4]

    String s1= new String(ch);   // s1="4321"  --> Value after performing a operation.

    long num=Long.parseLong(s1);  // num=4321

    Note: 1. Handle negative carefully.
          2. If range of input not inint range return 0;
          3. Check 2nd step by using this code-->

          if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
    return 0;
}

If you know these concepts this question will be cakewalk for you..

    */



     boolean neg=x<0;    // -123   true
     
     long val=Math.abs(x);
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

