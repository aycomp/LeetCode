class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        int end = k-1;
        
        int maxSum = 0;
        
        for(int i=0; i<k; i++){
            maxSum += nums[i];
        }
        int tempSum = maxSum;
        for(int i=0; i<nums.length-k; i++) {
            tempSum = tempSum - nums[i] + nums[i+k];
            if(tempSum > maxSum) {
                maxSum = tempSum;
            }
        }
        return (double) maxSum / k;
    }
}