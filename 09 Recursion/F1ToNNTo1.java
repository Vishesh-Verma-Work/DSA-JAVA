// n = 4, o/p => 4 3 2 1 1 2 3 4
public class F1ToNNNTo1 {
    public static void printFun(int n){
        if(n == 0) return;
        System.out.print(n + " "); //work
        printFun(n-1); //call
        System.out.print(n + " "); //work
    }
    public static void main(String[] args){
        printFun(4);
    }
}
