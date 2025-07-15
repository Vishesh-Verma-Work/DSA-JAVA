public class arrayImplementation {
    public static class ArrImpl{
        int[] arr = new int[5];
        int idx = 0;
        void display(){
            for(int i=0; i<=idx-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        void push(int val){
            if(isFull()){
                System.out.println("Array Stack is full, can't push more");
                return;
            }
            arr[idx] = val;
            idx++;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Array Stack is empty, can't pop");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;

            return top;
        }
        int peek(){
          if(isEmpty()){
                System.out.println("Array Stack is empty, can't peek");
                return -1;
            }  
            int val = arr[idx-1];
            return val;
        }
        boolean isFull(){
            if(arr.length == idx) return true;
            return false;
        }
        boolean isEmpty(){
            if(idx == 0) return true;
            return false;
        }
        void size(){
            System.out.println(idx);
        }
        
    }
    public static void main(String[] args) {
        ArrImpl a = new ArrImpl();
        a.push(1); 
        a.push(2); 
        a.push(3); 
        a.push(4); 
        a.push(5); 
         
        a.size(); 
        a.display();
        
        a.pop();
        
        a.size(); 
        a.display();


        a.pop();
        
 a.size(); 
        a.display();

        a.push(5); 

        a.size(); 
        a.display();
    }
}
