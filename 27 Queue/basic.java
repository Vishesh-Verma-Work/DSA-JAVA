import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class basic{
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> que2 = new ArrayDeque<>();


        System.out.println(que.isEmpty());
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que.isEmpty());
        System.out.println(que.size());

        System.out.println(que);
        que.poll();
        System.out.println(que);
        System.out.println(que.peek());


        
    }
}