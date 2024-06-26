class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        
        for(int i=0; i< nums.length; i++){
            if(nums[i] == 0){
                right++;
            } else {
                nums[left] = nums[right];
                left++;
                right++;
            }
        }
        for(int i=left; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}