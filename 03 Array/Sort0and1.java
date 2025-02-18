public class Sort0and1 {
    public static void Rev(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
    public static void main(String[] args) {
        int[] arr ={0,0,0,1,1,1};
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i] == 1 && arr[j] == 0){
                Rev(arr,i,j);
                i++;
                j--;
            }
            else if(arr[i] == 0 && arr[j] == 1){
                i++;
                j--;
            }
            else if(arr[i] == 0 && arr[j] == 0 ){
                i++;
            }
            else {
                j--;
            }
            
        }
        for(int k : arr){
            System.out.print(k +  " ");
        }
    }
}
