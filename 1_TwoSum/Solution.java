import java.util.Arrays;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        //Clone and sort to allow binary search.
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        
        int one = 0;
        boolean oneFound = false;
        int two = 0;
        boolean twoFound = false;

        //Find the 2 numbers forming the target. -> index + the difference
        for (int i = 0; i < sorted.length; i++) {
            int difference = target - sorted[i];
            int searchFor = Arrays.binarySearch(sorted, difference);
            if (searchFor >= 0) { //difference exists in the array
                one = sorted[i];
                two = difference;
                break;
            }
        }
        
        //Linear search till we find both numbers in the unsorted array.
        int i = 0;
        while (!oneFound || !twoFound || i < nums.length) {
            if (nums[i] == one && !oneFound) {
                one = i;
                oneFound = true;
            } else if (nums[i] == two && !twoFound) {
                two = i;
                twoFound = true;
            }

            i++;
        }
        
        return new int[] {one, two};
    }
}