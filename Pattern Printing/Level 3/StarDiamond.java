public class StarDiamond {
    public static void main(String[] args) {
        int n = 6;
        //upper part
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=i; j++){
                System.out.print("   ");
            }
            // make code for the lower half please
            System.out.println();
        }
    }
}

//          * 
//       *  *  *
//    *  *  *  *  *
// *  *  *  *  *  *  *
//    *  *  *  *  *
//       *  *  *
//          *