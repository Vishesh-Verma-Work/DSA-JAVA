public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        int[] res = new int[2];
        boolean flag = false;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    res[0] = i;
                    res[1] = j;
                    flag = true;
                    break;
                }
            }
            if(flag) break;
        }
        System.out.println(res[0] + " " + res[1]);
        
    }
}
