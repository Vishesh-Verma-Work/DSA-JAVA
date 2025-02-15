public class StarTriangleRev {
    public static void main(String[] args) {
        int n = 4;

        //best and better approch for other patterns too.
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // for(int i=n; i>0; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
}

// * * * * 
// * * * 
// * * 
// * 