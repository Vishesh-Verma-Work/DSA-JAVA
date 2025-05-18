
import java.util.*;

public class factorial {
    public static int fact(int n){
        if(n==1) return 1; //base case,when n == 1, stop the recursion
        else return n*fact(n-1);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fact(num));
        sc.close();
    }    
}
