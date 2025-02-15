public class StarPlus {
    public static void main(String[] args) {
        int odd = 5; // Ensure odd value for symmetry

        for (int i = 0; i < odd; i++) {  // Iterate rows
            for (int j = 0; j < odd; j++) {  // Iterate columns

                // Print '*' in the center column or center row
                if (i == odd / 2 || j == odd / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
