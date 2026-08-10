class Solution {
    public boolean halvesAreAlike(String s) {
        // 1. Convert to lowercase so uppercase vowels are not ignored
        s = s.toLowerCase(); 
        
        boolean bool = false;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // 2. First half check (Strictly <)
            if ((i < s.length() / 2) && ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u'))) {
                count++;
            }
            // 3. Second half check (Strictly >=)
            if ((i >= s.length() / 2) && ((s.charAt(i) == 'a') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'o') || (s.charAt(i) == 'u'))) {
                count--;
            }
        }
        
        if (count == 0) bool = true;
        return bool;
    }
}
