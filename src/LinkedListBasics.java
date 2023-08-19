import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListBasics {
    public static void main(String[] args) {
        List<Integer> l1  = new LinkedList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        // listIterator
        ListIterator<Integer> it = l1.listIterator();

        // forward traversal
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // backward traversal
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }

        // next() -> returns current index value and then moves to the next index
        System.out.println(it.next());
        System.out.println(it.next());

        // previous() -> moves to the previous index and then prints the current index value
        System.out.println(it.previous());
    }
}
