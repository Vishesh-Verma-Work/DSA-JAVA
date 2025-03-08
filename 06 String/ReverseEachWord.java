public class ReverseEachWord {
    public static void rev(int start,int end, StringBuilder sb){
        while(start < end){
            char ch = sb.charAt(start);
            sb.setCharAt(sb.charAt(start) , sb.charAt(end));
            sb.setCharAt(sb.charAt(end) , ch);
            start++;
            end--;
        }
    }   
    public static void main(String[] args) {
        // i am vishesh = i ma hsehsiv
        StringBuilder sb = new StringBuilder("vishesh verma ");
        // StringBuilder ans = new StringBuilder(sb.length());
        // ascii of space = 32
        // for(int i=0; i<sb.length(); i++){
        //     if((int)(sb.charAt(i)) == 32){
        //         ans.append(" ");
        //     }else{
        //         
        //     }
        // }

        int start = 0, end = 0;
        for(int i=0; i<sb.length(); i++){
        if((int)sb.charAt(end+1) == 32 || end == sb.length()-1){
            // call the function
            rev(start,end, sb);
            start = end;
        }else end++;
        }

        
    }
}
