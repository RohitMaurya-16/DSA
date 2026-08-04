
class Solution {
    public int[] productExceptSelf(int[] nums) {
    //     int n = nums.length;
    //     int arr[] = new int[n];
    //     Arrays.fill(arr, 1);

    //     for (int i = 0; i < n; i++) {
    //         arr[i] = pro(nums, i) * pro1(nums, i);
    //     }

    //     return arr;
    // }

    // public int pro(int[] nums, int k) {
    //     int prod = 1;
    //     for (int i = 0; i < k; i++) {
    //         prod *= nums[i];
    //     }
    //     return prod;
    // }

    // public int pro1(int[] nums, int k) {
    //     int prod = 1;
    //     for (int i = k + 1; i < nums.length; i++) {
    //         prod *= nums[i];
    //     }
    //     return prod;

     int n = nums.length;
        int[] arr = new int[n];

        // Prefix products
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] * nums[i - 1];
        }

        // Suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = arr[i] * suffix;
            suffix = suffix * nums[i];
        }

        return arr;
    }
}