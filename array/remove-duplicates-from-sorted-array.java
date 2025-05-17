class Solution {
    public int removeDuplicates(int[] nums) {
       int slowIndex = 0;
       for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
        if (nums[fastIndex] != nums[slowIndex]) {
            slowIndex++;
            nums[slowIndex] = nums[fastIndex];
        }
       }
       return slowIndex + 1;
    }
}