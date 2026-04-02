class Solution {
    public List<String> letterCombinations(String digits) {
        // Handle edge case: if input is empty, return an empty list immediately
        if (digits.isEmpty()) return new ArrayList<>();

        // 1. Initialize result list with an empty string to start the combinations
        List<String> result = new ArrayList<>();
        result.add("");

        // 2. Define the keypad mapping (index 2 = "abc", index 3 = "def", etc.)
        String mapping[] = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        // 3. Outer loop: Iterate through each digit in the input string (e.g., '2', then '3')
        for (int i = 0; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            int a = ch - '0';        // Convert character digit '2' to integer 2
            String s = mapping[a];   // Get corresponding letters, e.g., "abc"

            // Temporary list to hold new combinations for the current digit level
            List<String> finals = new ArrayList<>();

            // 4. Middle loop: Take every combination we have built so far (e.g., "a", "b", "c")
            for (String resultbreak : result) {
                
                // 5. Inner loop: Append each letter of the current digit to the existing prefix
                for (char sBreak : s.toCharArray()) {
                    // Example: if resultbreak is "a" and sBreak is 'd', add "ad"
                    finals.add(resultbreak + sBreak);
                }
            }
            
            // Update result to the newly formed combinations for the next iteration
            result = finals;
        }
        
        return result;
    }
}
