class Solution {
    public boolean isValid(String s) {
        Deque<Character> dq= new ArrayDeque<>();
        Map<Character, Character> map = Map.of(')', '(', ']', '[', '}', '{');

        for(char x:s.toCharArray())
        {
            if(map.containsKey(x))
            {
                if(dq.isEmpty() || dq.pop()!=map.get(x)) return false;
            }
            else
            {
                dq.push(x);
            }

        }
        return dq.isEmpty();
    }
}