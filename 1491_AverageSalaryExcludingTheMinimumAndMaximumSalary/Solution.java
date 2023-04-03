import java.util.Arrays;

class Solution {
    /*
     You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
     Return the average salary of employees excluding the minimum and maximum salary. 
     Answers within 10-5 of the actual answer will be accepted.
     */
    public static double average(int[] salary) {
        Arrays.sort(salary);
        double total = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            total += salary[i];
        }
        return total / (salary.length - 2);
    }
}