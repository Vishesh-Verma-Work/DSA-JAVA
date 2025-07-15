import java.util.Stack;
public class StockSpanProblem {
    public static void main(String[] args) {
        int[] price = {100,80,60,70,60,75,85};
        int[] ans = new int[price.length];
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<price.length; i++){
            // first pop the stack acc, that top contain lesser then i'th
            while(!st.isEmpty() && price[st.peek()] <= price[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = i+1;
            }else{
                ans[i] = i-st.peek();
            }

            st.push(i);
        }

        for(int x : ans){
            System.out.print(x+ " ");
        }
    }
}
