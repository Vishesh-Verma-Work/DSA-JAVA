
public class printNto1 {
    public static void printNum(int n){
        if(n==0) return;
        System.out.print(n +" ");
        printNum(--n);
    }
   public static void main(String[] args) {
        printNum(11);
   } 
}
