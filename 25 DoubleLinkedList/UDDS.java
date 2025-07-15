// User Defined Data Structure

class DNode {
    int val;
    DNode next;
    DNode prev;
    DNode(int val){
        this.val = val;
    }
}

class DDL{
    DNode head;
    DNode tail;
    int size = 0;
    void insertAtTail(int val){
        DNode temp = new DNode(val);
        if(size == 0){
            head = tail = temp;
        }else{
            tail.next = temp;
            temp.prev = tail;
            tail = tail.next;
        }
        size++;
    }

    void insertAtHead(int val){
        DNode temp = new DNode(val);
        if(size == 0) head = tail = temp;
        else {
            head.prev = temp;
            temp.next = head;
            head = head.prev;
        }
        size++;
    }

    void size(){
        System.out.println(size);
    }

    void printAll(){
        DNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtAnyIdx(int idx, int val){
        if(idx < 0 || idx  > size){
            System.out.println("Not Possible");
            return;
        }
        if(idx == 0){
            insertAtHead(val);
            return;
        }
        if(idx == size-1){
            insertAtTail(val);
            return;
        }

        DNode a = head;
        for(int i=1; i<idx; i++){
            a = a.next;
        }
        DNode b = a.next;

        DNode temp = new DNode(val);

        a.next = temp;
        temp.prev = a;
        b.prev = temp;
        temp.next = b;

        size++;
    }

    void deleteHead(){
        if(size == 0) return;
        head = head.next;
        head.prev = null;
        size--;
    }

    void deleteTail(){
        if(size == 0) return;
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    void inDeleteAtAnyIdx(int idx){
        if(idx < 0 || idx  > size-1){
            System.out.println("Not Possible");
            return;
        }
        if(idx == 0){
            deleteHead();
            return;
        }
        if(idx == size-1){
            deleteTail();
            return;
        }

        DNode a = head;
        for(int i=1; i<idx; i++){
            a = a.next;
        }
        a.next = a.next.next;
        a = a.next;
        a.prev = a.prev.prev;
        size--;
    }
}


class UDDS{
    public static void main(String[] args) {
    DDL l1 = new DDL();
    l1.insertAtTail(10);
    l1.insertAtTail(20);
    l1.insertAtTail(30);
    l1.insertAtTail(40);
    l1.insertAtTail(50);


    l1.printAll();
    l1.size();


    l1.inDeleteAtAnyIdx(2);

    l1.printAll();
    l1.size();
   
    }
}