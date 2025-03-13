import java.util.*;

public class SortString {
    public static void main(String[] args) {
        String str  = "vishesh";
        StringBuilder sb = new StringBuilder("verma");
        char[] ch = str.toCharArray();
        char[] sr = sb.toString().toCharArray();
        Arrays.sort(sr);
        Arrays.sort(ch);
        
        str = new String(ch);
        String str2 = new String(sr);
        System.out.println(str);
        System.out.println(str2);
    }   
}
