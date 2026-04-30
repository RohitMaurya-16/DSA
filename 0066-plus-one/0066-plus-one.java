class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry, return immediately
            }
            digits[i] = 0; // It was a 9, so it carries over
        }

        // If we reach here, the number was all 9s (e.g., 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1; // First digit becomes 1, others stay 0
        return result;
    }
}
