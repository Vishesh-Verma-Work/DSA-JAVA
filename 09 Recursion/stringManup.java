public class stringManup {
    public static void strMan(int n, String str,String ans){
        if(n == str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(n) != 'a') ans += str.charAt(n);
        strMan(n+1, str, ans);
    }
    public static void main(String[] args) {
        String str  = "Visaaahesh Verma";
        strMan(0,str,"");
        
    }
}
