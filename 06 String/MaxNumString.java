public class MaxNumString {
    public static void main(String[] args) {
        String[] str = {"012","013","29","0023", "30"};
        String mx = str[0];
        for(int i=0; i<str.length; i++){
            mx = max(mx, str[i]);
        }
        System.out.println(mx);
    }
    public static String max(String x, String y){
        String a = purify(x);
        String b = purify(y);
        if(a.length() < b.length()) return y;
        if(a.length() > b.length()) return x;
        
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) < b.charAt(i)) return y;
            if(a.charAt(i) > b.charAt(i)) return x;
        }
        return a;
    }
    public static String purify(String x){
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i) != '0') return x.substring(i);
        }
        return x; // will not run 
    }
}
