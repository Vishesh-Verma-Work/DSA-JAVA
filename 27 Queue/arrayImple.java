public class arrayImple {
    static class arrayImplementationClass{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        void add(int val){
            // overflow conditon check
            if(rear == arr.length-1){
                System.out.println("Queue is full, can not add more");
                return;
            }
            if(rear == -1 && front == -1){
                rear = front = 0;
                arr[rear] = val;
            }else{
                arr[++rear] = val;
            }
            size++;
            return;
        }
        int size(){
            return size;
        }
        int remove(){
            // underflow condition check
            if(size == 0){
                System.out.println("can not remove the element, Queue is Empty");
                return -1;
            }
            int val = arr[front++];
            size--;
            return val;

        }
        int peek(){
            if(size==0){
                System.out.println("Empty");
                return -1;
            }else{
                return arr[front];
            }
        }
        boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
        void display(){
            if(size == 0){
                System.out.println("empty");
                return; 
            }
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        arrayImplementationClass arr = new arrayImplementationClass();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.display();
        arr.peek();
        System.out.println(arr.size());
        arr.remove();
        System.out.println(arr.size());
        arr.display();
        arr.remove();
        arr.remove();
        System.out.println(arr.size());
        arr.display();
    }
}
