class Solution {
    public String reverseWords(String s) {
        s = s.strip();
        int i = s.length() - 1;
        char ch[] = s.toCharArray();
        char ch1[] = new char[s.length()];
        int k = 0;

        while (i >= 0) {
            while (i>=0 && ch[i] == ' ' ) {
                i--;
            }

            if (i < 0) {
                break;
            }

            int j = i;
            

            while (j >= 0 && ch[j] != ' ') {
                j--;
            }

             if (k > 0) {
            ch1[k++]=' ';
           }

            for (int x = j + 1; x <= i; x++) {
                ch1[k++] = ch[x];
            }
            i = j;
        }

        return new String(ch1, 0, k);
    }
}