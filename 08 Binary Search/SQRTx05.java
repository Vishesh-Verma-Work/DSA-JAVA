// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
// You must not use any built-in exponent function or operator.
// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 
// Example 1:
// Input: x = 4
// Output: 2
// Explanation: The square root of 4 is 2, so we return 2.

// Example 2:
// Input: x = 8
// Output: 2
// Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

public class SQRTx05 {
    public static void main(String[] args) {
        //return (int)(Math.pow(x, 0.5));
        int x = 64;
        int lw=0;
        int up = x;
        int mid;
        if(x<=1){
            System.out.println(x);
                return;
        }
        while(lw<=up){
            mid = (up-lw)/2 + lw;
            if(mid == x/mid){
                System.out.println(mid);
                return;
            }
            else if(mid > x/mid) up = mid-1;
            else  lw = mid+1;
        }
    }    
}


// or else we can use long if not wanted (mid == x/mid) rather then wanted (mid*mid == x)