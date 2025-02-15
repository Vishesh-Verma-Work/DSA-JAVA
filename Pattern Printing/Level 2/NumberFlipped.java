public class NumberFlipped {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            int x = 1;
            for(int j=1; j<=n; j++){
                if(i+j > n){
                    System.out.print(x++);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//     1
//    12
//   123
//  1234
// 12345