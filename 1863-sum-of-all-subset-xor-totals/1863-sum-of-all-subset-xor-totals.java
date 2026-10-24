class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum |= num;
        }

        return sum * (1 << (nums.length - 1));
    }
}
