// Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result. Find the smallest divisor such that the result mentioned above is less than or equal to threshold.
// Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5).
// The test cases are generated so that there will be an answer.

// Example 1:
// Input: nums = [1,2,5,9], threshold = 6
// Output: 5
// Explanation: We can get a sum to 17 (1+2+5+9) if the divisor is 1. 
// If the divisor is 4 we can get a sum of 7 (1+1+2+3) and if the divisor is 5 the sum will be 5 (1+1+1+2). 

// Example 2: description -
// Input: nums = [44,22,33,11,1], threshold = 5
// Output: 44

public class SmallestDivThreshold {
    public static void main(String[] args) {
        int arr[] = {1,2,5,9};
        int t =6;
        int mx = -1;
        for(int i=0; i<arr.length; i++){
        //mx = Math.max(mx,arr[i]);
            if(mx < arr[i]){
                mx = arr[i];
            }
        }
        // i get the max value
        int lw = 1; 
        int up = mx;
        int sum = 0;
        int mid = 1;;
        while(lw<=up){
            mid = lw + (up-lw)/2;
            sum = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]%mid==0) sum += arr[i]/mid;
                else sum += arr[i]/mid+1;
            }
            if(sum <= t){
                up = mid-1; 
            }
            else lw = mid+1;
        }
        System.out.println(lw);
    }
}
