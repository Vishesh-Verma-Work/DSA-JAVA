import java.util.*;
public class PowerFac {

    public static int powerFind(int num,int pow){ // TC = O(pow)
        if(num == 0 && pow == 0){
            System.out.println("Invalid");
            return -1;
        }
        if(pow == 0) return 1;
        return num * powerFind(num, pow-1);
    }
    public static int powerFind2(int num,int pow){ // TC = O(log pow)
        if(num == 0 && pow == 0){
            System.out.println("Invalid");
            return -1;
        }
        if(pow == 0) return 1;
        int ans = powerFind2(num, pow/2);
        if(pow%2==0) return ans*ans;
        else return ans*ans*num;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int pow = sc.nextInt();
    System.out.println(powerFind2(num,pow));;
    }
}
