class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int mid = 0;
        int maxValueInPiles = 0;

        for (int pile : piles) {
            maxValueInPiles = Math.max(pile, maxValueInPiles);
        }
        int right = maxValueInPiles;

        while (left < right) {
            mid = left + (right - left) / 2;

            if (canEatInTime(piles, mid, h)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canEatInTime(int[] piles, int mid, int h) {
        double eatTimeNeeded = 0;

        for (int pile : piles) {
            eatTimeNeeded += Math.ceil(pile / (double)mid);
        }

        return eatTimeNeeded <= h;
    }


}