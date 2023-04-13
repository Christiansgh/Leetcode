import java.util.ArrayList;

class Solution {
    /*
     * Given an integer array nums and an integer k, return the k most frequent elements. 
     * You may return the answer in any order.
     */

    private ArrayList<ArrayList<Integer>> numberOccurances;

    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer> occurances = new ArrayList<Integer>();
        numberOccurances.add(number);
        numberOccurances.add(occurances);
        
        for (int i : nums) {
            if (number.contains(i)) { 
                int index = number.indexOf(i); 
                int value = occurances.get(number.indexOf(i)); //maybe sort & binary search might be faster?
                value++;
                occurances.set(index, value);
            } else { //add a number to keep track of, increment occurances.
                number.add(i);
                occurances.add(1);
            }
        }
    }


}