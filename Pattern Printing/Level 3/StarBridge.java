public class StarBridge {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=(2*n-1); i++){
            System.out.print(" * ");
        }
        System.out.println();
        int m = n-1;
        for(int i = 1; i<=m; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" * ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("   ");
            }
            for(int j=1; j<=n-i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
// *  *  *  *  *  *  * 
// *  *  *     *  *  *
// *  *           *  *
// *                 *
