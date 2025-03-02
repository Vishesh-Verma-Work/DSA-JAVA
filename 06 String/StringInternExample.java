public class StringInternExample {
    public static void main(String[] args) {
        String s1 = "hello"; // Stored in String Pool
        String s2 = "hello"; // Reuses the same object from the pool

        System.out.println(s1 == s2); // true (Same reference)

        String s3 = new String("hello"); // New object in Heap
        System.out.println(s1 == s3); // false (Different references)

        String s4 = s3.intern(); // Moves to the String Pool
        System.out.println(s1 == s4); // true (Same reference after interning)
        System.out.println(s1 == s3); // false 
    }
}
