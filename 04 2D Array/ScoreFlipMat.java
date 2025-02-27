public class ScoreFlipMat {
    public static void main(String[] args) {
        int[][] arr =   {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        for(int i=0; i<arr.length; i++){
            if(arr[i][0] == 0){
                for(int j=0; j<arr[0].length; j++){
                    if(arr[i][j] == 0) arr[i][j] =  1;
                    else arr[i][j] = 0;
                }
            }
        }

        int noZero = 0, noOne = 0;
        for(int i=0; i<arr[0].length; i++){
            noZero = 0;
            noOne = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j][i] == 0) noZero++;
                else noOne++;
            }
            if(noZero > noOne){
                for(int k=0; k<arr.length; k++){
                    if(arr[k][i] == 0) arr[k][i] = 1;
                    else arr[k][i] = 0;
                }
            }
        }

        int sum = 0;
        int mul = 0;
        for(int i=0; i<arr.length; i++){
            mul = 0;
            for(int j=arr[0].length-1; j>=0; j--){
                if(arr[i][j] == 1){
                    sum += Math.pow(2,mul++);
                }
                else{
                    mul++;
                }
            }
        }

        System.out.println(sum);
    }
}
