class Solution {

    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        int l = 0;
        int r = 0;
        int sum = 0;
        double ans = Double.NEGATIVE_INFINITY;

        while (r < n) {

            sum += nums[r];

            if ((r - l + 1) > k) {
                sum -= nums[l];
                l++;
            }

            if ((r - l + 1) == k) {
                ans = Math.max(ans, (double) sum);
            }

            r++;
        }

        return ans / k;
    }
}