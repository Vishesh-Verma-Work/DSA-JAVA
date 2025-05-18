public class Sum1ToN {
    public static int sum(int n){
        if(n == 1 || n == 0) return n;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}



// with parameter 
// public class Sum1ToN {
//     public static int sum(int n,int sum){
//         if(n == 0){
//             System.out.println(sum);
//             return 0;
//         }
//         sum(n-1,sum+n);
//         return 0;
//     }
//     public static void main(String[] args) {
//         sum(100,0);
//     }
// }

