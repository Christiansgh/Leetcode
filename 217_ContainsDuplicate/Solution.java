import java.util.Arrays;

class Solution {
    /*
     * Given an integer array nums, return true if any value appears at least twice in the array, 
     * and return false if every element is distinct.
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        int latter = nums[0] + 1;

        for (Integer i : nums) {
            if (i == latter) {
                return true;
            }

            latter = i;
        }

        return false;
    }
}
