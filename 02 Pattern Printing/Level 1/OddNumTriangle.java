public class OddNumTriangle {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((2*j-1) + " ");
            }
            System.out.println();
        }
    }
}

// 1 
// 1 3
// 1 3 5
// 1 3 5 7