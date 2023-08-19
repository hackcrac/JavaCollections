import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        System.out.println(st.add(3));
        System.out.println(st.push(4));;
        System.out.println(st);

        while(!st.isEmpty()){
            System.out.println(st.peek());// it returns top element of the stack
            System.out.println(st.pop()); // it returns the top element of the stack and also removes the top element of the stack
        }
    }
}
