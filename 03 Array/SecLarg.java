public class SecLarg {
    public static void main(String[] args) {
        int[] nums = {44,2,4,1,-5,3,7,12,45,2,15,13,19,2,4,-7};
        int sec = Integer.MIN_VALUE;
        int larg=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>larg){
                sec = larg;
                larg = nums[i];
            }
            else if(nums[i]<larg && nums[i]>sec){
                sec = nums[i];
            }
        }
        System.out.println(sec);
    }
}