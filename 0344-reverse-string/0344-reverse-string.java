class Solution {
    public void reverseString(char[] s) {
        int right = s.length - 1;
        char[] result = new char[s.length]; 
        int left = 0;
        
        // 1. Fill the temporary 'result' array (Your logic)
        while (right >= 0) {
            result[left] = s[right];
            right--;
            left++; 
        }
        
        for (int i = 0; i < s.length; i++) {   // i am using this beacuse return is void it mean return must in s array not resutl array.
            s[i] = result[i];
        }
    }
}
