import java.util.*;
public class ReverseEachWord {
    public static void rev(int start,int end, StringBuilder sb){
        while(start < end){
            char ch = sb.charAt(start);
            sb.setCharAt(start , sb.charAt(end));
            sb.setCharAt(end , ch);
            start++;
            end--; 
        }
    }   
    public static void main(String[] args) {
        // i am vishesh = i ma hsehsiv
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int start = 0, end = 0;
        while(end<sb.length()){
            if(sb.charAt(end) != ' ') end++;
            else{
                rev(start, end-1, sb);
                start = end+1;
                end = start;
            }
        }
        rev(start, end-1, sb); // for the reversal of the last loop bro!! :(
        System.out.println(sb);

        sc.close();

        
    }
}
