import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "abc";
        String t = "bac";

        if(s.length() != t.length()) System.out.println("NO");
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0; i<s1.length;  i++){
            if(s1[i] != s2[i]) System.out.println("NO");
        }
        System.out.println("TRUE");
    }
}
