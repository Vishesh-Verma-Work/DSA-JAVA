public class LowerBoundIdx {
    // lower bound
    public static void main(String[] args) {
        int arr[] = {10,20,30,32,32,32,32,32,32,40,50,60};
        int lw = 0, up = arr.length-1;
        int x = 19;
        int mid = 0;
        while(lw<=up){
            mid = (up-lw)/2 + lw;
            if(arr[mid] == x) {
                while(x == arr[mid]){
                    mid--;
                }
                System.out.print(mid+1 + " is the Index");
                return;
            }
            else if(arr[mid] < x) lw = mid +1;
            else up = mid - 1;
        }
        System.out.print(mid + " is the index");

    }
}
