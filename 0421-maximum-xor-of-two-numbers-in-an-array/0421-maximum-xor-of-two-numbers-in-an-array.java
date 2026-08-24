

class Solution {

    public int findMaximumXOR(int[] nums) {

        int max = 0;
        int mask = 0;

        for (int bit = 30; bit >= 0; bit--) {

            mask = mask | (1 << bit);

            HashSet<Integer> set = new HashSet<>();

            for (int num : nums) {
                set.add(num & mask);
            }

            int candidate = max | (1 << bit);

            for (int prefix : set) {

                if (set.contains(prefix ^ candidate)) {
                    max = candidate;
                    break;
                }
            }
        }

        return max;
    }
}