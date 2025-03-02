import java.util.Scanner;

public class TotalNumDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Another inBuilt fun to convert num mto string
        // String str = Integer.toString(num);
        String str = num + "";
        System.out.println(str.length());

        sc.close();
    }    
}
