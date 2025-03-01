public class Basic {
    public static void main(String[] args) {

        // String Making
        String name = "Vishesh Verma";
        String branch = " CS";

        // String Concatination
        System.out.println(name + branch);

        // length() function
        System.out.println("name : " + name.length());
        System.out.println("branch : " + branch.length());
        System.out.println((name + branch).length());

        // charAt() function
        System.out.println(branch.charAt(1));

        // indexOf() function - return first occuring char index
        System.out.println(name.indexOf("hesh")); // 3
        System.out.println(name.indexOf("s")); // 2
        System.out.println(name.indexOf("S")); // -1

        // lastIndexOf() function - return from last to start first occuring char index
        System.out.println(name.lastIndexOf("rma")); // 10
        System.out.println(name.lastIndexOf("a")); // 12

        // compareTo() function compare 2 string lexographacially
        String a = "abc";
        String b = "Abc";
        String c = "abc";
        String d = "abcddd";
        System.out.println(a.compareTo(b)); // a-A = 97-65=32
        System.out.println(a.compareTo(c)); // 0
        System.out.println(b.compareTo(a)); // A-a = 65-97=-32

                // if case is : abcddd - abc then, if preString is same, it return the rest length of the string
                System.out.println(a.compareTo(d)); // -3
                System.out.println(d.compareTo(a)); // 3
        

        // contains() a sub string or not? T/F (name = "Vishesh Verma")
        System.out.println(name.contains("shesh ")); // true
        System.out.println(name.contains(" Verma")); // true
        System.out.println(name.contains("sheshv")); // false

        // startsWith()
        System.out.println(name.startsWith("vis")); // false
        System.out.println(name.startsWith("Vishesh")); // true

        // endsWith()
        System.out.println(name.endsWith("erma")); // true
        System.out.println(name.endsWith("A")); // false

        // concat() concate two or more strings
        System.out.println(a.concat(b)); // abc + Abc = abcAbc
        System.out.println(b.concat(a)); // Abc + abc = Abcabc
        System.out.println(a.concat(a).concat(a)); // abc + abc + abc = abcabcabc

        // toLowerCase() or toUpperCase()
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());    
                // dont change the actual string
                
                
        // is String mutable????
        String x = "hell shell YES";
        String m = x.toUpperCase();
        System.out.println(m);
        m = "HRII";
        System.out.println(m);


        // substring(i) substring(i,j) name = "Vishesh Verma"
        System.out.println(name.substring(9)); // erma
        System.out.println(name.substring(9,12)); // erm (j is excluded)
        System.out.println(name.substring(0)); // Vishesh Verma
        System.out.println(name.substring(12)); // a
        System.out.println(name.substring(0,0)); // ""
        // System.out.println(name.substring(13,-1)); // error give - cant rev in java
    }
}
