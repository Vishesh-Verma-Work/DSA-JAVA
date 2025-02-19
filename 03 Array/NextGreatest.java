// Brute Force o(N^2)
// public class NextGreatest {
//     public static void main(String[] args) {
//         int[] arr = {12,8,41,37,3,49,16,28,21};
//         int[] res = new int[arr.length];
//         int largest;
//         for(int i=0; i<arr.length; i++){
//             largest = Integer.MIN_VALUE;
//             for(int j=i+1; j<arr.length; j++){
//                 if(largest < arr[j]){
//                     largest = arr[j];
//                 }
//             }
//                 res[i] = largest;
//         }

//         res[res.length-1] = -1;

//         for(int i : res){
//             System.out.print(i + " ");
//         }
//     }
// }

// Optimized Approch o(N)
public class NextGreatest {
    public static void main(String[] args) {
        int[] arr = {12,8,41,37,3,49,16,28,21};
        int[] res = new int[arr.length];
        int NextGreatestElement = arr[arr.length-1];
        res[arr.length-1] = -1;
        for(int i=arr.length-2; i>=0; i--){
            res[i] = NextGreatestElement;
            NextGreatestElement = Math.max(NextGreatestElement, arr[i]);
        }
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}