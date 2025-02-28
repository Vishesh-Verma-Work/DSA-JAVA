public class SetMatZero {
    static public void setMat(int[][] arr, int row, int col){
        // for making row as 0, a[i][j] i is fixed
        for(int i = 0; i<arr[0].length; i++){
            arr[row][i] = 0;
        }
        // for making col as 0, a[i][j] j is fixed
        for(int i = 0; i<arr.length; i++){
            arr[i][col] = 0;
        }

    }
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] cpy = new int[arr.length][arr[0].length];

        // make copy of the arr
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                cpy[i][j] = arr[i][j];
            }
        }

        // seting the data
        for(int i=0; i<cpy.length; i++){
            for(int j=0; j<cpy[0].length; j++){
                if(cpy[i][j] == 0){
                    setMat(arr,i,j);
                }
            }
        }

        // printing
        for(int i=0; i<cpy.length; i++){
            for(int j=0; j<cpy[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
