class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,4,3};
        // Arrays.sort(arr);
        boolean flag;
        int n = arr.length;
        for(int i=0; i<n; i++){
            flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}