import java.util.ArrayList;

class Solution {
    /*
     * Given an integer array nums sorted in non-decreasing order, 
     * remove the duplicates in-place such that each unique element appears only once. 
     * The relative order of the elements should be kept the same. 
     * Then return the number of unique elements in nums.
     */
    public static int removeDuplicates(int[] nums) {
        //new ArrayList to store uniques in.
        ArrayList<Integer> al = new ArrayList<>();

        //check index 0 before we iterate.
        if (nums.length >= 2) {
            if (nums[0] != nums[1]) {
                al.add(nums[0]);
            } else {
                al.add(nums[1]);
            }
        } else { //less than 2 elements must mean theres only 1 unique.
            return 1;
        }
    
        //iterate and add uniques.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                al.add(nums[i]);
            }
        }

        //override []nums
        for (int i = 0; i < al.size(); i++) {
            nums[i] = al.get(i);
        }

        return al.size();
    }
}