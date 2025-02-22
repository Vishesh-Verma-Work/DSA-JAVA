public class SpiralForm {
    public static void main(String[] args) {
            int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20},{21,22,23,24}};
            int minRow = 0, minCol = 0;
            int maxRow = arr.length-1, maxCol = arr[0].length-1;
            while(minRow <= maxRow && minCol <= maxCol){
                for(int i=minCol; i<=maxCol; i++){
                    System.out.print(arr[minRow][i] + "  ");
                }
                minRow++;
                if(minRow>maxRow || minCol>maxCol) break;
                for(int i=minRow; i<=maxRow; i++){
                    System.out.print(arr[i][maxCol] + "  ");
                }
                maxCol--;
                if(minRow>maxRow || minCol>maxCol) break;
                for(int i=maxCol; i>=minCol; i--){
                    System.out.print(arr[maxRow][i] + "  ");
                }
                maxRow--;
                if(minRow>maxRow || minCol>maxCol) break;
                for(int i=maxRow; i>=minRow; i--){
                    System.out.print(arr[i][minCol] + "  ");
                }
                minCol++;
        }
    }
}
