public class Union2SortedArr {
    public static void main(String[] args) {
        int[] n1 = {12,23,23,213,400};
        int[] n2 = {10,23,34,45,243,267,889,890,960};
        int[] n3 = new int[n1.length + n2.length];
        int i = 0, j = 0, k = 0;
        while(i < n1.length && j < n2.length){
            if(n1[i]<n2[j]){
                n3[k] = n1[i];
                k++; i++;
            }
            else{
                n3[k] = n2[j];
                k++; j++;
            }
        }
        if(i == n1.length){
            while(j < n2.length){
                n3[k] = n2[j];
                j++; k++;
            }
        }else{
            while(i < n1.length){
                n3[k] = n1[i];
                i++; k++;
            }
        }

        for(int l : n3){
            System.out.print(l + " ");
        }
        
    }
}
