// peak-index-in-a-mountain-array
// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
// Return the index of the peak element.
// Your task is to solve it in O(log(n)) time complexity.

// Example 1:
// Input: arr = [0,1,0]
// Output: 1

// Example 2:
// Input: arr = [0,2,1,0]
// Output: 1

// Example 3:
// Input: arr = [0,10,5,2]
// Output: 1

public class PeakIndexMountain04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,5,4};
        int mid, lw = 1, up = arr.length-2;
        while(lw<=up){
            mid = (up-lw)/2 + lw;
            if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                lw = mid+1;
            }else if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]){
                up = mid-1;
            }
            else{
                System.out.print(mid);
                return;
            }
        }
    }
}
