import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();

        //adding one element at a time;
        l1.add(1);
        l1.add(2);
        l1.add(3);

        // converting arrayList to array
        Integer[] arr = l1.toArray(new Integer[0]);


        // setting value at index
        l1.set(1, 4);

        // copying list
        List<Integer> l2 = new ArrayList<Integer>(l1);

        // both variable are referring to the same list
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());

        //after adding one element to l2 . Both refer to different list
        l2.add(5);
        System.out.println(l1.hashCode());
        System.out.println(l2.hashCode());

        // adding many element at once from other list;
        l2.addAll(l1);
        System.out.println(l2);

        // subList
        List<Integer> l3 = l2.subList(1,4); // start index is inclusive and end index is exclusive
        System.out.println(l3);
        System.out.println(l2);
        l3.set(0,100);
        // making change on l3 is also affecting l2. It means l3 is just a view of the l2 and shallow copy is done here.
        System.out.println(l2);
    }
}
