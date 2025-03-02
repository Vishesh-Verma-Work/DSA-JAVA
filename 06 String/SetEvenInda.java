import java.util.Scanner;

public class SetEvenInda {
    // set the even index of input string as a and rest of the string is same
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        for(int i=0; i<str.length(); i++){
            if(i%2==0) ans += 'a';
            else ans += str.charAt(i);
        }

        System.out.println(ans);

        sc.close();

    }
}
