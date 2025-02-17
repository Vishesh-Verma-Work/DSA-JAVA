public class ReverseArr {
    public static void main(String[] args) {
        int[] num = {2,3,4,5,6,7,8,9};
        int temp;
        int i = 0;
        int j = num.length-1;
        while(i<j){
            temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;
        }
        for(int x : num){
            System.out.print(x + " ");
        }
    }
}
