class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findLeftBound(nums, target);
        int right = findRightBound(nums, target);

        return new int[] {left, right};
    }

    private int findLeftBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int index = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }

    private int findRightBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int index = -1;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                index = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return index;
    }
}