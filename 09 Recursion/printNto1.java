
public class printNto1 {
    public static int printNum(int n){
        if(n==0) return 1; // base case.
        System.out.println(n); // work
        return printNum(--n); // call


    }
   public static void main(String[] args) {
        printNum(11);
   } 
}
