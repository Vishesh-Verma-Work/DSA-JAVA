public class l2 {
    static class Node{
        int value;
        Node next;
        Node(int val){
            this.value = val;
        }
    }
    public static void printByRecursion(Node head){
        // By Loop
        // while(temp!= null){
        //     System.out.println(temp.value);
        //     temp = temp.next;
        // }

        // By Recursion
        if(head == null){
            return;
        }
        printByRecursion(head.next);
        System.out.println(head.value);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        printByRecursion(a);
    }
}
