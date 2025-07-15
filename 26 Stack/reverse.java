import java.util.Stack;
public class reverse {
    public static void reverseStack(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()){
            temp.push((st.pop()));
        }

        System.out.println(temp);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        reverseStack(st);
    }
}
