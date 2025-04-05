// Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
// An integer a is closer to x than an integer b if:

// |a - x| < |b - x|, or
// |a - x| == |b - x| and a < b
 
// Example 1:
// Input: arr = [1,2,3,4,5], k = 4, x = 3
// Output: [1,2,3,4]

// Example 2:
// Input: arr = [1,1,2,3,4,5], k = 4, x = -1
// Output: [1,1,2,3]

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KClosestEle07 {
    public static void main(String[] args) {
        int k = 4;
        int x = 3;
        int[] arr = {1,2,3,4,5};
        List<Integer> li = new ArrayList<>();
        
        if(x < arr[0]){
            for(int i = 0; i < k; i++){
                li.add(arr[i]);
            }
            System.out.println(li);
            return;
        }

        if(x > arr[arr.length - 1]){
            for(int i = arr.length - k; i < arr.length; i++){
                li.add(arr[i]);
            }
            System.out.println(li);
            return;
        }

        int lw = 0, hi = arr.length - 1;
        int lb = hi;
        while(lw <= hi){
            int mid = lw + (hi - lw) / 2;
            if(arr[mid] >= x){
                lb = Math.min(lb, mid);
                hi = mid - 1;
            } else {
                lw = mid + 1;
            }
        }

        int i = lb - 1;
        int j = lb;
        while(k > 0 && i >= 0 && j < arr.length){
            int d1 = Math.abs(x - arr[i]);
            int d2 = Math.abs(x - arr[j]);
            if(d1 <= d2){
                li.add(arr[i]);
                i--;
            } else {
                li.add(arr[j]);
                j++;
            }
            k--;
        }

        while(k > 0 && i >= 0){
            li.add(arr[i]);
            i--;
            k--;
        }

        while(k > 0 && j < arr.length){
            li.add(arr[j]);
            j++;
            k--;
        }

        Collections.sort(li);
        System.out.println(li);
    }
}
