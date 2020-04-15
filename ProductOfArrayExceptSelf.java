class Solution {
    // using three array
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] left_products = new int[N];
        int[] right_products = new int[N];
        int[] output = new int[N];

        left_products[0] = 1;
        right_products[N - 1] = 1;

        for (int i = 1; i < N; i++) {
            left_products[i] = nums[i - 1] * left_products[i - 1];
        }

        for (int i = N - 2; i >= 0; i--) {
            right_products[i] = nums[i + 1] * right_products[i + 1];

        }

        for (int i = 0; i < N; i++) {
            output[i] = left_products[i] * right_products[i];
        }

        return output;
    }

    // using only one array
    public int[] productExceptSelf2(int[] nums) {
        int N = nums.length;
        int[] output = new int[N];
        output[0] = 1;

        for (int i = 1; i < N; i++) {
            output[i] = nums[i - 1] * output[i - 1];
        }
        int R = 1;
        for (int i = N - 1; i >= 0; i--) {
            output[i] = output[i] * R;
            R = R * nums[i];
        }

        return output;
    }

}