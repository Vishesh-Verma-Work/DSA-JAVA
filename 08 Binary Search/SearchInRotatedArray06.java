// public class SearchInRotatedArray06 {
//     public static void main(String[] args) {
//         int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
//         int target = 6;
//         int result = searchTarget(arr, target);
//         System.out.println("Target found at index: " + result);
//     }

//     public static int binarySearch(int[] arr, int i, int j, int target) {
//         while (i <= j) {
//             int mid = i + (j - i) / 2;
//             if (arr[mid] == target) return mid;
//             else if (arr[mid] < target) i = mid + 1;
//             else j = mid - 1;
//         }
//         return -1;
//     }

//     public static int searchTarget(int[] arr, int target) {
//         int n = arr.length;
//         if (n == 0) return -1; // Edge case: empty array
//         if (n == 1) return (arr[0] == target) ? 0 : -1; // Edge case: single element

//         int lw = 0, up = n - 1;
//         int pivot = -1;

//         // Step 1: Find the pivot (largest element)
//         while (lw <= up) {
//             int mid = lw + (up - lw) / 2;

//             // Check if mid is the pivot
//             if (mid < n - 1 && arr[mid] > arr[mid + 1]) {
//                 pivot = mid;
//                 break;
//             }
//             // Check if mid-1 is the pivot
//             if (mid > 0 && arr[mid - 1] > arr[mid]) {
//                 pivot = mid - 1;
//                 break;
//             }

//             // Move search boundaries
//             if (arr[mid] >= arr[lw]) { // Pivot is in the second half
//                 lw = mid + 1;
//             } else { // Pivot is in the first half
//                 up = mid - 1;
//             }
//         }

//         // If no pivot is found, array is already sorted, do a normal binary search
//         if (pivot == -1) {
//             return binarySearch(arr, 0, n - 1, target);
//         }

//         // Step 2: Search in the correct sorted part
//         if (arr[0] <= target && target <= arr[pivot]) {
//             return binarySearch(arr, 0, pivot, target);
//         }
//         return binarySearch(arr, pivot + 1, n - 1, target);
//     }
// }


class SearchInRotatedArray06 {
    public static void main(String[] args) {
        int target = 17;
                int[] arr = {3,4,5,6,7,0,1,2};
                int n = arr.length;
               int lw = 0, hi = n-1;
               while(lw<=hi){
                int mid = lw + (hi-lw)/2;
                if(arr[mid] == target){
                    System.out.print(mid);
                    return;
                }
                else if(arr[mid] <= arr[hi]){ //2nd half mai hai
                    if(target <= arr[hi] && target > arr[mid]) lw = mid + 1;
                    else hi = mid-1;
                }
                else{
                    // 1st half
                    if(target >= arr[lw] && target < arr[mid]) hi = mid -1; 
                    else lw  = mid + 1;
                }
            }
                System.out.println("None");
                return;
            
    }
}