// User Defined Data Type
class DNode{
      int val;
        DNode next;
        DNode prev; //extra
        DNode(int val){
                this.val = val;
        }      
        
}

class UDDT{
    public static void print(DNode head){
            DNode temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
    }
    public static void printInRev(DNode tail){
        DNode temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp  = temp.prev;
        }
        System.out.println();
    }
    public static void printByRandomNode(DNode node){
        DNode temp = node;
        while(temp.prev != null){
            temp = temp.prev;
        }
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        DNode a1 = new DNode(10);
        DNode a2 = new DNode(20);
        DNode a3 = new DNode(30);
        a1.next = a2; a2.prev = a1;
        a2.next = a3; a3.prev = a2; 
        print(a1);
        printInRev(a3);
        printByRandomNode(a2);
    }
}