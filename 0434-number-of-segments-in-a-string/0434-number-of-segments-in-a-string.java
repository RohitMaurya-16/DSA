class Solution {
    public int countSegments(String s) {
    //    ArraList<Integer> list= new ArrayList<>();
    if(s.length()==0)return 0;
     int count=0;
      s=s.trim();
      if(s.isEmpty())return 0;
       for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)==' ')
        {
            if(s.charAt(i+1)!=' ')
            {
                count++;
            }
        }

       }
       return count+1;
    }
}