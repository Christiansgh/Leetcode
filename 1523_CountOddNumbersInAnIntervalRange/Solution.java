class Solution {
    /* 
       Given two non-negative integers low and high. 
       Return the count of odd numbers between low and high (inclusive).
     */

    public static int countOdds(int low, int high) {
        int n = 0;
        if (!(low % 2 == 0) || !(high % 2 == 0)) {
            n++;
        }
        return (high - low) / 2 + n;
    }
}