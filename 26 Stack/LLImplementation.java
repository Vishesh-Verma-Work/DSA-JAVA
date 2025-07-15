class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}

public class LLImplementation {
        static class LLImple{
        ListNode head;
        int size = 0;

        void size(){
            System.out.println(size);
        }

        void push(int val){
            if(size == 0){
                ListNode temp = new ListNode(val);
                head = temp;
                size++;
                return;
            }
            ListNode temp = new ListNode(val);
            temp.next = head;
            head = temp;
            size++;
        }
        void peek(){
            if(isEmpty()){
                System.out.println("Empty");
                return;
            }
            System.out.println(head.val);
        }
        void display(){
            ListNode temp = head;
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
        void pop(){
            if(isEmpty()){
                System.out.println("LL is Empty, Can't pop the vlaue");
                return;
            }
            head = head.next;
            size--;
        }

    }
    public static void main(String[] args) {
        LLImple l1 = new LLImple();
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.push(4);
        l1.push(5);

        l1.display();
        l1.size();

        l1.pop();

        l1.display();
        l1.size();

    }
}
