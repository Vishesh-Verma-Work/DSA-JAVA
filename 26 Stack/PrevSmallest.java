import java.util.Stack;

public class PrevSmallest {
    public static void main(String[] args) {
        int[] arr = {3,1,0,8,6};
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            while(st.size() > 0 && st.peek() >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }

        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}
