import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST 1 ===   //FALSE");
        Interval i1 = new Interval(0, 30);
        Interval i2 = new Interval(5, 10);
        Interval i3 = new Interval(15, 20);
        ArrayList<Interval> al = new ArrayList<Interval>();
        al.add(i1);
        al.add(i2);
        al.add(i3);
        System.out.println(Solution.canAttendMeetings(al));

        System.out.println("=== TEST 2 ===   //TRUE");
        Interval i4 = new Interval(5, 8);
        Interval i5 = new Interval(9, 15);
        Interval i6 = new Interval(15, 20);
        ArrayList<Interval> al2 = new ArrayList<Interval>();
        al2.add(i4);
        al2.add(i5);
        al2.add(i6);
        System.out.println(Solution.canAttendMeetings(al2));
    }
}
