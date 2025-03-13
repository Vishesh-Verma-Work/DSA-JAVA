public class StringCompre {
    public static void main(String[] args) {
        char[] arr = {'a','a','a','a','a','a','b','c','c','c'};
        StringBuilder sb = new StringBuilder();
        int i = 0, j=1;
        while(j<arr.length){
            if(arr[i] != arr[j]){
                // call the function
                int diff = j-i;
                sb.append(arr[i]);
                if(diff>1) sb.append(diff);
                i = j;
                j = i+1;
            }else j++;
        }
        sb.append(arr[i]);
        if(j-i+1 > 1) sb.append(j-i+1);
        System.out.println(sb);
    }
}
