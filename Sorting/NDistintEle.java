
public class NDistintEle {
    public static void main(String[] args) {
        int[] arr = {54,11,28,47,91,63};
        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);
        int x = -1;
        for(int i=0; i<temp.length; i++){
            for(int j=0; j<temp.length; j++){
                if(temp[i] == arr[j]) arr[j] = ++x;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}


// public class NDistintEle {
//     public static void main(String[] args) {
//         int[] arr = {54,11,28,47,91,63};
//         int x = 0, idx = -1;
//         for(int i=0; i<arr.length; i++){
//             int min = Integer.MAX_VALUE;
//             idx = -1;
//             for(int j=0; j<arr.length; j++){
//             if(arr[j] < min && arr[j] > x){
//                 min = arr[j];
//                 idx = j;
//             }
//         }
//         if (idx != -1) {
//             arr[idx] = x++;
//         }
//         }   

//         for(int ele : arr){
//             System.out.print(ele + " ");
//         }
//     }
// }