class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int tempSum = 0;

        for (int i = 0; i < k; i++) {
            tempSum += nums[i]; 
        }

        int sum = tempSum;
        
        for (int left = 0; left < nums.length - k; left++) {
            tempSum = tempSum - nums[left] + nums[left + k];
            sum = Math.max(sum, tempSum);
        }

        return sum / (double) k;
        
    }
}