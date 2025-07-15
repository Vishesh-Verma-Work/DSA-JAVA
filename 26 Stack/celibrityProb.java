import java.util.Stack;

public class celibrityProb {
    public static void main(String[] args) {
        int[][] arr = {{0,1,0},{0,0,0},{0,1,0}};
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            st.push(i);
        }

        while(st.size() > 1){
            int i = st.pop();
            int j = st.pop();

            if(arr[i][j] == 0){
                st.push(i);
            }else{
                st.push(j);
            }
        }

        int celeb = st.pop();

        for(int i=0; i<arr.length; i++){
            if(i != celeb){
            if(arr[celeb][i] == 1 || arr[i][celeb] == 0 ){
                return;
            }
        }
    }
    System.out.println(celeb);


    }
}
