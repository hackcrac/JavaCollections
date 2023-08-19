import java.util.*;

public class HashSetBasics {
    public static void main(String[] args) {
        // Hashset doesn't maintain any order
        Set<Integer> s1 = new HashSet<>();
        s1.add(3);
        s1.add(2);
        s1.add(5);
        s1.add(1);
        s1.add(4);
        // LinkedHashSet maintains the order of insertion
        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(3);
        s2.add(2);
        s2.add(5);
        s2.add(1);
        s2.add(4);
        System.out.print(s1);
        System.out.println(" "+ s2);

        List<StudentMarks> l2 = new ArrayList<>();
        l2.add(new StudentMarks(89, 90));
        l2.add(new StudentMarks(69, 91));
        l2.add(new StudentMarks(41, 69));
        l2.add(new StudentMarks(98, 100));
        l2.add(new StudentMarks(89, 98));
        l2.add(new StudentMarks(89, 70));

        Set<StudentMarks> s3 = new LinkedHashSet<>(l2);

        /** System.out.println(s3.contains(new StudentMarks(89, 90)));
         * It will return false because internally set and hashMap uses
         * hashCode for assigning the bucket index to the element. Since, creating new object will create different hashcode.
         * Therefore, it will create problem, and we need to override equals() and hashCode() method to solve this problem.
        */

        // after overriding equals() and hashCode()
        System.out.println(s3.contains(new StudentMarks(89, 90)));
    }
}
