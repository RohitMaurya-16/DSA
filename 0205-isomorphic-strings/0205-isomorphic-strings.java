class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!=t.length())return false;

        Map<Character, Character> maps=new HashMap<>();
        Map<Character, Character> mapt=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char chs=s.charAt(i);
            char cht=t.charAt(i);

            if(maps.containsKey(chs))
            {
                if(maps.get(chs)!=cht)
                {
                    return false;
                }
            }
                else
                {
                    maps.put(chs,cht);
                }
        }

        for(int i=0;i<s.length();i++)
        {
            char chs=s.charAt(i);
            char cht=t.charAt(i);

            if(mapt.containsKey(cht))
            {
                if(mapt.get(cht)!=chs)
                {
                    return false;
                }
            }
                else
                {
                    mapt.put(cht,chs);
                }

        }
        return true;
    }
}