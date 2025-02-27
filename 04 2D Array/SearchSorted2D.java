public class SearchSorted2D {

    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 232;
        int i = 0;
        int j = arr[0].length-1;
        boolean flag  = false;

        while (i< arr.length && j >= 0) {
            if(arr[i][j] < target){
                i++;
            }else if(arr[i][j] > target){
                j--;
            }else{
                System.out.print("TRUE");
                flag = true;
                break;
            }
        }

        if(!flag){
            System.out.print("NO");
        }
    }
}