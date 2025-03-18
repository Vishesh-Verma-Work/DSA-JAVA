public class SelectionSort02 {
    public static void main(String[] args) {
        int[] arr = {-123,10,-4,20,1,8,-6};
        int n = arr.length;
        for(int i=0; i<n; i++){
                int idx = min(arr,i,n);
                swap(arr,i,idx);
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
    public static int min(int[] arr, int i,int j){
        int minIndx = i;
        for(int x=i+1; x<j; x++){
            if(arr[x] < arr[minIndx]) minIndx = x;
        }
        return minIndx;
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
