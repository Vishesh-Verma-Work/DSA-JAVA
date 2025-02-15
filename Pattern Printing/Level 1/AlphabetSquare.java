public class AlphabetSquare {
    public static void main(String[] args) {
        int n = 7;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}

// A B C D 
// A B C D
// A B C D
// A B C D