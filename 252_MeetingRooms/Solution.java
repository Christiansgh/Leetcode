import java.util.Comparator;
import java.util.List;

public class Solution implements Comparator<Interval> {
    /**
     * @param intervals: an array of meeting time intervals
     * @return if a person could attend all meetings
     */
    public static boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(new Solution()); //sort -> earliest meeting first.
        for (int i = 0; i <= intervals.size() - 2; i++) {
            printCurrent(intervals.get(i));
            //if the start of the next meeting is before the end of the current meeting -> return false.
            if (intervals.get(i).end > intervals.get(i + 1).start) { 
                printCurrent(intervals.get(i + 1));
                System.out.println("Overlap here.");
                return false;
            }
        }

        printCurrent(intervals.get(intervals.size() - 1));
        return true;
    }

    @Override
    public int compare(Interval o1, Interval o2) {
        return o1.start - o2.start;
    }

    private static void printCurrent(Interval interval) {
        System.out.println(interval.start + " " + interval.end);
    }
}