class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(0, nums, new ArrayList(), resultList);
        return resultList;
    }

    public void backtrack(int start, int[] nums, List<Integer> tempList, List<List<Integer>> resultList) {
        resultList.add(new ArrayList<>(tempList));

        for (int i=start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(i+1, nums, tempList, resultList);
            tempList.remove(tempList.size() - 1);
        }
    }

}