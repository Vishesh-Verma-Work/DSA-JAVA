import java.util.Scanner;

public class ToggleEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i=0; i<sb.length(); i++){
            if((int)(sb.charAt(i)) <= 91 && (int)(sb.charAt(i)) >= 64){
                char x = (char)((int)(sb.charAt(i)) + 32);
                sb.setCharAt(i, x);
            }else if((int)(sb.charAt(i)) >= 97 && (int)(sb.charAt(i)) <= 123){
                char x = (char)((int)(sb.charAt(i)) - 32);
                sb.setCharAt(i, x);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
