public class stairPath {
    public static int countStair(int n){
        if(n==1 || n==2) return n;
        else return countStair(n-1) + countStair(n-2);
    }
    public static void main(String[] args) {
     System.out.println(countStair(5));   
    }
}
