public class mazePath {
    public static int paths(int row,int col){
        if(row == 1 || col == 1) return 1;
        int down = paths(row, col-1);
        int right =  paths(row-1, col);
        return down+right;
    }
    public static void main(String[] args) {
     System.out.println(paths(3,4));   
    }
}
