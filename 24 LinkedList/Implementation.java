class implementation{
    static class NodeCreate{
        int value;
        NodeCreate next;
        NodeCreate(int value){
            this.value = value;
        }
    }

    public static void print(NodeCreate head){
        NodeCreate temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        NodeCreate a = new NodeCreate(10);
        NodeCreate b = new NodeCreate(20);
        NodeCreate c = new NodeCreate(30);
        NodeCreate d = new NodeCreate(40);
        NodeCreate e = new NodeCreate(50);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        print(a);
    }
}