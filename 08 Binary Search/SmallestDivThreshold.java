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
