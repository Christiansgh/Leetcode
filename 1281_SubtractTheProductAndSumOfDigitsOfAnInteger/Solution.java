public class Solution {
    /*
     * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
     */
    public static int subtractProductAndSum(int n) {
        int[] digits = toArray(n);

        return getProduct(digits) - getSum(digits);
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    private static int getProduct(int[] array) {
        int product = 1;
        for (int i : array) {
            product *= i;
        }
        return product;
    }

    private static int[] toArray(int n) {
        int size = (int) Math.log10(n) + 1;
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }
}
