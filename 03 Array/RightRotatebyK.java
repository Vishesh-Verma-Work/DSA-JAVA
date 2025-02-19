public class RightRotatebyK {
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int i = 0;
        int d = k % nums.length;
        int j = nums.length - d - 1;
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
        i = nums.length - d;
        j = nums.length-1; 
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
        i = 0;
        j = nums.length-1;
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
        for(int l : nums){
            System.out.print(l + " ");
        } 
    }
}
