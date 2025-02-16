class Method {

    static int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int sum = add(10, 5);  
        System.out.println("Addition: " + sum);
        Method obj = new Method(); 
        int diff = obj.subtract(10, 5);   
        System.out.println("Subtraction: " + diff);
    }
}
