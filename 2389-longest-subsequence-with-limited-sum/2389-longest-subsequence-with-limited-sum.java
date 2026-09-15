import java.util.*;

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        Arrays.sort(nums);

        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int target = queries[i];

            int left = 0;
            int right = n - 1;
            int result = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (prefix[mid] <= target) {
                    result = mid + 1;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            ans[i] = result;
        }

        return ans;
    }
}