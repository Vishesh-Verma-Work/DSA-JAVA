// // Brute Force Approch
// public class DuplicateElem {
//     public static void main(String[] args) {
//         int[] arr = {0,1,2,3,4,5,0};
//         boolean flag = false;
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     System.out.print(arr[i] + " is an Duplicate Element");
//                     flag = true;
//                     break;
//                 }
//             }
//             if(flag) break;
//         }
//     }
// }


// //  Better Approch 
// public class DuplicateElem {
//     public static void main(String[] args) {
//         int[] arr = {0,1,2,3,4,4,5};
//         int[] hash = new int[arr.length-1];

//         for(int i=0; i<arr.length; i++){
//             hash[arr[i]] += 1;
//         }
//         for(int i=0; i<hash.length; i++){
//             if(hash[i] == 2){
//                 System.out.print(i + " is an Duplicate Element");
//             }
//         }
//     }
// }


public class DuplicateElem {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,5,6,7,8,9};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int crr = max * (max+1) / 2;
        System.out.print(sum-crr + " is an Duplicate Element"); 
    }
}