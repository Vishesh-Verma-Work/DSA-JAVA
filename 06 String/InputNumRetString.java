import java.util.Scanner;

public class InputNumRetString {
    public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in)        ;;
    int num = sc.nextInt();
    String str = "" + num;
    System.out.println(str);
    System.out.println(str.getClass().getSimpleName());

    sc.close();
    }
}
