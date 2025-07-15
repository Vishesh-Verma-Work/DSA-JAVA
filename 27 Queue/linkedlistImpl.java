public class linkedlistImpl {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    static class llImp{
        int size = 0;
        Node head = null;
        Node tail = null;

        void add(int val){
            Node temp = new Node(val);

            if(tail == null && head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
        int remove(){
            //underflow check
            if(isEmpty()){
                System.out.println("LL is empty");
                return -1;
            }
            if(head == tail){
                int val = head.val;
                head = null;
                tail = null;
                size = 0;
                return val;
            }
            int val = head.val;
            head = head.next;
            size--;
            return val;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            return head.val;
        }
        int size(){
            return size;
        }

    }
    public static void main(String[] args) {
        llImp l = new llImp();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.display();
        l.remove();
        l.display();
    }
}
