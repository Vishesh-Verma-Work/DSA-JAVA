import java.util.Scanner;

public class StringBuilderBasics {
    public static void main(String[] args) {
        String a = "abc";
        StringBuilder b = new StringBuilder();
        // System.out.println(b.capacity());


        // taking an stringBuilder as input
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);


    }
}
