import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBasics {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        // addition of elements from the front
        dq.offer(1);
        dq.offerFirst(3);
        dq.addFirst(4);
        System.out.println(dq);
        // addition of elements from the back
        dq.addLast(5); // equivalent -> dq.add(5);
        dq.offerLast(6);
        System.out.println(dq);


        // accessing the element
        System.out.println(dq.peek()); // dq.peek() -> dq.peekFirst();
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.element()); // dq.element() -> dq.getFirst();
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        // removing elements from the front
        dq.pop();
        dq.removeFirst(); // equivalent -> dq.remove();
        dq.pollFirst();
        System.out.println(dq);
        // removing elements from the back
        dq.pollLast();
        dq.removeLast();
        System.out.println(dq);
    }
}
