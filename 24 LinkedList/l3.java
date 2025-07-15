public class l3 {
    /* ----------  Node class ---------- */
    static class Node{
        int value;
        Node next;
        Node(int val){
            this.value = val;
        }
    }

    /* ----------  Singly-linked-list class ---------- */
    static class SingleLinkedList {
        private Node head;
        private Node tail;
        private int  size = 0;

        /* insert at end ---------------------------------------------------- */
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail      = temp;
            }
            size++;
        }

        /* insert at front -------------------------------------------------- */
        void insertAtFront(int val){
            Node temp = new Node(val);
            if (head == null){
                head = tail = temp;
            } else {
                temp.next = head;
                head      = temp;
            }
            size++;
        }

        /* insert at index (0-based) --------------------------------------- */
        void insertAtIndex(int idx, int val){
            if (idx < 0 || idx > size){
                System.out.println("Invalid index");
                return;
            }
            if (idx == 0){
                insertAtFront(val);
                return;
            }
            if (idx == size){
                insertAtEnd(val);
                return;
            }

            Node prev = head;
            for (int i = 1; i <= idx - 1; i++){
                prev = prev.next;
            }
            Node node = new Node(val);
            node.next = prev.next;
            prev.next = node;
            size++;
        }

        /* get element ------------------------------------------------------ */
        int getElement(int idx){
            checkBounds(idx);
            if (idx == size - 1) return tail.value;   // fast path

            Node temp = head;
            for (int i = 1; i <= idx; i++){
                temp = temp.next;
            }
            return temp.value;
        }

        /* set element ------------------------------------------------------ */
        void setElement(int idx, int val){
            checkBounds(idx);
            if (idx == size - 1){
                tail.value = val;
                return;                       // done, no traversal needed
            }
            Node temp = head;
            for (int i = 1; i <= idx; i++){
                temp = temp.next;
            }
            temp.value = val;
        }

        /* delete at index -------------------------------------------------- */
        void deleteValue(int idx){
            checkBounds(idx);

            // delete head
            if (idx == 0){
                head = head.next;
                size--;
                if (size == 0) tail = null;   // list became empty
                return;
            }

            // find node before the one to delete
            Node prev = head;
            for (int i = 1; i <= idx - 1; i++){
                prev = prev.next;
            }

            // update tail if needed
            if (prev.next == tail){
                tail = prev;
            }

            prev.next = prev.next.next;       // unlink target
            size--;
        }

        /* helpers ---------------------------------------------------------- */
        private void checkBounds(int idx){
            if (head == null) throw new RuntimeException("Linked list is empty");
            if (idx < 0 || idx >= size)
                throw new IndexOutOfBoundsException("Index out of bounds");
        }

        void displayLinkedList(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void sizeOfLinkedList(){
            System.out.println(size);
        }
    }

    /* --------------------------- driver ---------------------------------- */
    public static void main(String[] args) {
        SingleLinkedList l1 = new SingleLinkedList();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.insertAtEnd(40);
        l1.insertAtEnd(50);
        l1.insertAtEnd(60);

        l1.displayLinkedList();   // 10 20 30 40 50 60
        l1.sizeOfLinkedList();    // 6

        l1.deleteValue(4);        // delete element “50”
        l1.displayLinkedList();   // 10 20 30 40 60
        l1.sizeOfLinkedList();    // 5
    }
}
