class DNode{
    int val;
    DNode next;
    DNode prev;
    DNode(int val){
        this.val = val;
    }
}

public class checkPalindrom {

    public static boolean checkPalindromeByAnyNode(DNode node){
        DNode head = node;
        while(head.prev != null){
            head = head.prev;
        }
        DNode tail = node;
        while(tail.next != null){
            tail = tail.next;
        }
        while(head != tail){
            if(head.val != tail.val){
                return false;
            }
            head = head.next;
            tail = tail.prev;
        }
        return true;

    }
    public static void main(String[] args) {
    DNode a1 = new DNode(1);
    DNode a2 = new DNode(2);
    DNode a3 = new DNode(3);
    DNode a4 = new DNode(2);
    DNode a5 = new DNode(1);

    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a5;

    a5.prev = a4;
    a4.prev = a3;
    a3.prev = a2;
    a2.prev = a1;

    System.out.println(checkPalindromeByAnyNode(a2));

    }
}
