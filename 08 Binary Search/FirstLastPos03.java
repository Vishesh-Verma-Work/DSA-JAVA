
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

// Example 3:
// Input: nums = [], target = 0
// Output: [-1,-1]

class FirstLast03{
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,3,3,4,5,7757,5675};
        int[] sol = {-1,-1};
        int mid, lw = 0, up = arr.length-1;
        int target  = 3;
        while(lw<=up){
            mid = (up-lw)/2 + lw;
            if(arr[mid] == target){
                int i = mid;
                while(i>= 0 && arr[mid] == arr[i]){
                    i--;
                }
                sol[0] = ++i;
                i = mid;
                while(i< arr.length && arr[mid] == arr[i]){
                    i++;
                }
                sol[1] = --i;
            break;
            }
            else if(arr[mid] < target) lw = mid + 1;
            else up = mid-1;

        }
        System.out.print(sol[0] + " " + sol[1]);

    }
}



// Standard Method  --->
// this is the demo code, paste the entire code here
// class FirstLast03 {
//     public int[] searchRange(int[] arr, int target) {
//         int[] sol = {-1, -1}; // Default if target not found
        
//         // Find first occurrence
//         int lw = 0, up = arr.length - 1;
//         while (lw <= up) {
//             int mid = lw + (up - lw) / 2;
//             if (arr[mid] == target) {
//                 sol[0] = mid;
//                 up = mid - 1; // Keep searching in left part
//             } else if (arr[mid] < target) {
//                 lw = mid + 1;
//             } else {
//                 up = mid - 1;
//             }
//         }

//         // Find last occurrence
//         lw = 0;
//         up = arr.length - 1;
//         while (lw <= up) {
//             int mid = lw + (up - lw) / 2;
//             if (arr[mid] == target) {
//                 sol[1] = mid;
//                 lw = mid + 1; // Keep searching in right part
//             } else if (arr[mid] < target) {
//                 lw = mid + 1;
//             } else {
//                 up = mid - 1;
//             }
//         }

//         return sol;
//     }
// }





// waste code ---->
// class Solution {
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {
//         List<Integer> li = new ArrayList<>();
        
//         if(x < arr[0]){
//             for(int i = 0; i < k; i++){
//                 li.add(arr[i]);
//             }
//             return li;
//         }

//         if(x > arr[arr.length - 1]){
//             for(int i = arr.length - k; i < arr.length; i++){
//                 li.add(arr[i]);
//             }
//             return li;
//         }

//         int lw = 0, hi = arr.length - 1;
//         int lb = hi;
//         while(lw <= hi){
//             int mid = lw + (hi - lw) / 2;
//             if(arr[mid] >= x){
//                 lb = Math.min(lb, mid);
//                 hi = mid - 1;
//             } else {
//                 lw = mid + 1;
//             }
//         }

//         int i = lb - 1;
//         int j = lb;
//         while(k > 0 && i >= 0 && j < arr.length){
//             int d1 = Math.abs(x - arr[i]);
//             int d2 = Math.abs(x - arr[j]);
//             if(d1 <= d2){
//                 li.add(arr[i]);
//                 i--;
//             } else {
//                 li.add(arr[j]);
//                 j++;
//             }
//             k--;
//         }

//         while(k > 0 && i >= 0){
//             li.add(arr[i]);
//             i--;
//             k--;
//         }

//         while(k > 0 && j < arr.length){
//             li.add(arr[j]);
//             j++;
//             k--;
//         }

//         Collections.sort(li);
//         return li;
//     }
// }
