import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetBasics {
    public static void main(String[] args) {

        NavigableSet<StudentMarks> s1 = new TreeSet<>(
                // set is not inserting element who have same maths marks
                // irrespective of whether they have same physics marks
                // this condition will arise if we only use maths marks in comparable or comparator
                (a, b) -> {
                    if (a.getMaths() == b.getMaths()) return a.getPhysics() - b.getPhysics(); // adding physics number here now it is also considering physics marks for comparison
                    return a.getMaths() - b.getMaths();
                }
        );

        s1.add(new StudentMarks(89, 90));
        s1.add(new StudentMarks(69, 91));
        s1.add(new StudentMarks(41, 69));
        s1.add(new StudentMarks(98, 100));
        s1.add(new StudentMarks(89, 98));
        s1.add(new StudentMarks(89, 98));
        s1.add(new StudentMarks(89, 70));

        for (StudentMarks it : s1) {
            System.out.println(it + " ");
        }
        System.out.println();

        System.out.println(s1.ceiling(new StudentMarks(50, 80)));
        System.out.println(s1.floor(new StudentMarks(50, 80)));
        System.out.println(s1.higher(new StudentMarks(50, 80)));
        System.out.println(s1.lower(new StudentMarks(50, 80)));
        System.out.println(s1.first());
        System.out.println(s1.last());
        System.out.println(s1.pollFirst());
        System.out.println(s1.pollLast());
        System.out.println(s1.contains(new StudentMarks(80, 90)));
    }
}
