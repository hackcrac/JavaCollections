import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        /**
         * for ascending order return any negative value;
         * for equal order return zero;
         * for descending order return any positive value;
         */
        return o2 - o1;
    }
}
