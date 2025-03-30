public class BinarySearch01 {
    // binary search
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 19;
        int lw = 0, up = arr.length-1;
        while(lw <= up){
            int mid = (lw+up)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < target) lw = mid+1;
            else up = mid-1;
        }

        System.out.println("not found");
    }
}
