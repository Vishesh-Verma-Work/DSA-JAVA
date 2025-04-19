// take number input and print from n to 1 by using recursion
public class print1toN {
    public static void printNum(int n){
        int num=1;
        if(num == n) return; 
        System.out.print(num +" ");
        printNum(++num);
    }
   public static void main(String[] args) {s
        printNum(11);
   } 
}
