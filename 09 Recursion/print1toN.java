// take number input and print from 1 to n by using recursion
public class print1toN {
    public static void printNum(int n){ 
        if(n == 0) return;
        printNum(n-1);
        System.out.print(n + "  ");
    }
   public static void main(String[] args) {
        printNum(11);
   } 
}



















