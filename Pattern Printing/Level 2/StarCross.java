
// public class StarCross {
//     public static void main(String[] args) {
//         int n=5;
//         int a=1;
//         int b=n;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n; j++){
//                 if( j == a || j == b){
//                     System.out.print(" * ");
//                 }else{
//                     System.out.print("   ");
//                 }
//             }
//             a++;
//             b--;
//             System.out.println();
//         }
//     }
// }



public class StarCross {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j || i+j == n+1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

// *           * 
//    *     *
//       *
//    *     *
// *           *