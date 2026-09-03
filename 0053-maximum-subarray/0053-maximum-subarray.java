class Solution {
    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}





// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//        int max = Intger MIN_VALUE;
//         for(int i =0; i<n; i++){
//             for(int j=i; j<n; j++){
//                 int sum =0;
//                 for(int k=i; k<=j; k++){
//                     sum += nums[k];
//                 }
//                 if(sum>max){
//                  max=sum;
//                 }
//             }

//         }
//         return max;
//     }
// }