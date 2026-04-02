

class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve(result, "", 0, 0, n);
        return result;
    }

    void solve(List<String> res, String curr, int open, int close, int n) {
        // Base case
        if (curr.length() == 2 * n) {
            res.add(curr);
            return;
        }

        // Add opening bracket
        if (open < n) {
            solve(res, curr + "(", open + 1, close, n);
        }

        // Add closing bracket
        if (close < open) {
            solve(res, curr + ")", open, close + 1, n);
        }
    }
}