public class Isomorphic {
    public static void main(String[] args) {
        String s  = "badc";
        String t = "baba";
        if(s.length() != t.length()) System.out.print("FALSE");
        char[] arr = new char[128];
        for(int i=0; i<s.length(); i++){
            if(arr[(int)(s.charAt(i))] == 0){
                arr[(int)(s.charAt(i))] = t.charAt(i);
            }
            else if(arr[(int)(s.charAt(i))] == t.charAt(i)){
                    continue;
            }else{
                System.out.println("FALSE");
                return;
            }
        }
        for(int i=0; i<128; i++){
            arr[i] = '\0';
        }
        for(int i=0; i<t.length(); i++){
            if(arr[(int)(t.charAt(i))] == 0){
                arr[(int)(t.charAt(i))] = s.charAt(i);
            }
            else if(arr[(int)(t.charAt(i))] == s.charAt(i)){
                    continue;
            }else{
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE");
    }
}
