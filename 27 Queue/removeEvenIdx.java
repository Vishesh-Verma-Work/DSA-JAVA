import java.util.LinkedList;
import java.util.Queue;
class removeEvenIdx{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        Queue<Integer> helperQ = new LinkedList<>();

        while(!q.isEmpty()){
            q.poll();
            if(!q.isEmpty()) helperQ.add(q.poll());
        }
        System.out.println(helperQ);
    }
}