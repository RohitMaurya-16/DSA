class Solution {
    public boolean rotateString(String s, String goal) {

    //     if(s.length()!=goal.length())return false;
          
    //     if(s.equals(goal))return true;
        
    //     int n=s.length();

    //     char[] ch1= s.toCharArray();
    //     char[] ch2=goal.toCharArray();

    //     for(int i=1;i<s.length();i++)
    //     {
    //         if(isGoal(ch1,ch2,i,n)) return true;
    //     }
    //     return false;
    // }

    // public static boolean isGoal(char[] ch1, char[] ch2,int k,int n)
    // {   boolean bool=true;
    //     char[] temp=new char[n];
    //     for(int i=0;i<n;i++)
    //     {
    //         temp[(i+k)%n]=ch2[i];
    //     }

    //     for(int i=0;i<n;i++)
    //     {
    //         if(ch1[i]!=temp[i]) return false;
    //     }
    //     return true;

     //MORE OPTIMAL CODE:: 

     return s.length()==goal.length() && (s+s).contains(goal);
    }
}