import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int row = arr.length;
        int col = arr[0].length;

        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}