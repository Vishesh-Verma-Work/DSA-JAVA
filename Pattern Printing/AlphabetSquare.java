public class AlphabetSquare {
    public static void main(String[] args) {
        int n = 7;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print((char)(j+65) + " ");
            }
            System.out.println();
        }
    }
}

// A B C D 
// A B C D
// A B C D
// A B C D