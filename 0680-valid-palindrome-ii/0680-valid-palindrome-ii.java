// class Solution {
//     public boolean validPalindrome(String s) {
//         int left = 0, right = s.length() - 1;

//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return isPalindrome(s, left + 1, right) || 
//                        isPalindrome(s, left, right - 1);
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     private boolean isPalindrome(String s, int left, int right) {
//         while (left < right) {
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }
// }


// Above one is brute force


class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                // Try skipping one character (either left or right)
                return isPalindrome(s, left + 1, right) || 
                       isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    // Check palindrome within given range
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}