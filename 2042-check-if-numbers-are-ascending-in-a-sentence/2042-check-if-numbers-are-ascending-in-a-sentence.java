
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public boolean areNumbersAscending(String s) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
       List<Integer> list=new ArrayList<>();
        while (matcher.find()) {
            String numStr = matcher.group();
            int num = Integer.parseInt(numStr);
           list.add(num);
            System.out.println("Found number: " + num);
        } 

        for(int i=0;i<list.size()-1;i++)
        {
            if(list.get(i)>=list.get(i+1)) 
            return false;
        }

        return true;
    }
}