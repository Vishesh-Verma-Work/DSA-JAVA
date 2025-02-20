
// public class Transpose {
//     public static void main(String[] args) {
//         int[][] arr = {{1,2,3},{4,5,6}};
//         for(int i=0; i<arr[0].length; i++){
//             for(int j=0; j<arr.length; j++){
//                 System.out.print(arr[j][i]);
//             }
//             System.out.println();
//         }
//         int[][] str = new int[3][2];
//         for(int i=0; i<arr[0].length; i++){
//             for(int j=0; j<arr.length; j++){
//                 str[i][j] = arr[j][i];
//             }
//         }
//         for(int i=0; i<arr[0].length; i++){
//             for(int j=0; j<arr.length; j++){
//                 System.out.print(str[i][j] + "   ");
//             }
//             System.out.println();
//         }
//     }
// }


// transpose with 0(1) Space Complexity in place changes
// SQUARE MATRIX SHOULD BE THERE 100%
public class Transpose {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}, {7,8,9}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }   
    }
}