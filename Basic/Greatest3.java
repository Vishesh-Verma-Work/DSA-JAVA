public class Greatest3 {

    public static void main(String[] args) {
        int a=111,b=111,c=111;
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else {
                System.out.println(c);
            }
        }else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}