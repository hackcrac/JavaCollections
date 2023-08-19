import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(3);
        l1.add(2);
        l1.add(5);
        l1.add(1);
        l1.add(4);
        Queue<Integer> pq1 = new PriorityQueue<>(l1);
        /** items are popped in ascending order but what if we want to pop the element in descending order.
         * But we can't change the implementation of comparable interface implemented by Integer wrapper class.
         * for that we have to use comparator interface.
         */
        while(!pq1.isEmpty()){
            System.out.println(pq1.poll());
        }

        // usage of Comparator interface
        //Queue<Integer> pq2 = new PriorityQueue<Integer>(new MyComparator());
        Queue<Integer> pq2 = new PriorityQueue<Integer>(((a,b) -> b-a));
        for(int item : l1) pq2.offer(item);

        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }

        // to make priorityQueue decide the priority of any custom class then you have to implement the comparable interface.
        // You also use comparator to also decide the priority
        List<StudentMarks> l2 = new ArrayList<>();
        l2.add(new StudentMarks(89, 90));
        l2.add(new StudentMarks(69, 91));
        l2.add(new StudentMarks(41, 69));
        l2.add(new StudentMarks(98, 100));
        l2.add(new StudentMarks(89, 98));
        l2.add(new StudentMarks(89, 70));

        Queue<StudentMarks> pq3 = new PriorityQueue<>(l2);
        while(!pq3.isEmpty()){
            System.out.println(pq3.poll());
        }
    }
}
