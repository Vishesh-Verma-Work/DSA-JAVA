public class OnePlus {
    public static int[] OnePlusFun(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; 
                return digits; 
            }
            digits[i] = 0;
        }
        
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        int[] digits = {1,2,3,4,5};
        int[] finAns =  OnePlusFun(digits);
        for(int i : finAns){
            System.out.print(i +" ");
        }
    }
}
