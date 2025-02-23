import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number : ");
        int n = sc.nextInt();

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> subList = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i) subList.add(1);
                else subList.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
            ans.add(subList);
        }

        for(int i=0; i<ans.size(); i++){
            for(int k=0; k<= ans.size()-i-1; k++){
                System.out.print(" ");
            }
            for(int j=0; j<ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.println();
        }

        
        sc.close();
    }
}
