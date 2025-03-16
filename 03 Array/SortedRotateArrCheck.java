public class SortedRotateArrCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int i = 0;  
     int newNum = 0;
     for(i=0; i<arr.length-1; i++){
        if(arr[i] <= arr[i+1]) continue;
        else{
            newNum = i+1;
            break;
        }
    }
    if(newNum == 0) System.out.println("t");
    for(int j=newNum; j<arr.length-1; j++){
        if(arr[j] <= arr[j+1]) continue;
        else System.out.println("f");
    }   
    if(arr[arr.length-1] <= arr[0]) System.out.println("t");
    //fix a bit , just use a flag
    // flag to toggle switch
     System.out.println("f");
    
    }
}
