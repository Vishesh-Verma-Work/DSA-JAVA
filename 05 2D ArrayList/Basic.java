import java.util.*;
public class Basic {
    public static void main(String[] args) {
        List<List<Integer>> v = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();

        a.add(1); a.add(2); a.add(3); a.add(4);
        b.add(22); b.add(22);
        c.add(78);

        v.add(a);
        v.add(b);
        v.add(c);

        // System.out.print(v);
        // [[1, 2, 3, 4], [22, 22], []]

        // for(int i=0; i<v.size(); i++){
        //     System.out.println(v.get(i));
        // }
        // [1, 2, 3, 4]
        // [22, 22]
        // []


        for(int i=0; i<v.size(); i++){
            for(int j=0; j<v.get(i).size(); j++){
                System.out.print(v.get(i).get(j) + "  ");
            }
            System.out.println();
        }
    }
}
