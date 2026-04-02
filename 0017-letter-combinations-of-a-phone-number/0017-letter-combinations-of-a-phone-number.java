class Solution {
    public List<String> letterCombinations(String digits) {

    // Let suppose digits is 23

    List<String> result=new ArrayList<>();
    result.add("");

    String mapping[]=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    for(int i=0;i<digits.length();i++)
    {
        char ch=digits.charAt(i);
        int a=ch-'0';        // 2---> Integer
        String s=mapping[a];   // abc

        List<String> finals=new ArrayList<>();

        for(String resultbreak:result)
        {
            for(char sBreak:s.toCharArray())
            {
                finals.add(resultbreak+sBreak);
            }
        }
        result=finals;
    }
    return result;
    }
}