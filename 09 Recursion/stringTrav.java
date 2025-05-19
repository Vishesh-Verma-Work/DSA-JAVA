public class stringTrav {
    public static void print(int n,String str){
        if(str.length() == n) return;
        System.out.print(str.charAt(n) + " ");
        print(n+1, str);
    }
    public static void main(String[] args) {
        String str = "Vishesh Verma";
        print(0,str);
    }
}
