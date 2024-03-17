class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0){
            return true;
        }
        int count = 0;
        int prev = 0;
        int next = 0;
        for(int i = 0; i<flowerbed.length; i++) {
            prev = (i==0 || flowerbed[i-1] == 0) ? 0 : 1;
            next = (i == flowerbed.length -1 || flowerbed[i+1] == 0) ? 0 : 1;
            if(flowerbed[i] == 0 && prev == 0 && next == 0){
                flowerbed[i] = 1;
                count ++;
                if(count == n){
                    return true;
                }
            }
        }
        return false;
    }
}