public class NumberStarBridge {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=(2*n-1); i++){
            System.out.print(" " + i + " ");
        }
        System.out.println();
        int m = n-1;
        for(int i = 1; i<=m; i++){
            int num = 1;
            for(int j=1; j<=n-i; j++){
                System.out.print(" " + num++ + " ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("   ");
                num++;
            }
            for(int j=1; j<=n-i; j++){
                System.out.print(" " + num++ + " ");
            }
            System.out.println();
        }
    }
}

// 1  2  3  4  5  6  7 
// 1  2  3     5  6  7
// 1  2           6  7
// 1                 7