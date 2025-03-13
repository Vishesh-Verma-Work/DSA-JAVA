import java.util.Scanner;

public class CharOccurMost {
    //Input : sadvshdsdhcaacad
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];
        for(int i=0; i<str.length(); i++){
            arr[(int)(str.charAt(i)) - 97] += 1;
        }
        int mx = arr[0];
        for(int i=0; i<arr.length; i++){
            if(mx < arr[i]){
                mx = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]== mx){
                System.out.print((char)(i+97) + " ");
            }
        }
        sc.close();
    }
}
