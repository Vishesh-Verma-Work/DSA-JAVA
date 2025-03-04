public class ReverseEachWord {
    public static void main(String[] args) {
        // i am vishesh = i ma hsehsiv
        StringBuilder sb = new StringBuilder("i am vishesh  verma");
        StringBuilder ans = new StringBuilder(sb.length());
        // ascii of space = 32
        for(int i=0; i<sb.length(); i++){
            if((int)(sb.charAt(i)) == 32){
                ans.append(" ");
            }else{
                // fill the code 
            }
        }
    }
}
