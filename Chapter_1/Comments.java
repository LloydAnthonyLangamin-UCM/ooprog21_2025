public class Comments {
    public static void main(String[] args) {
        // single line comment
        System.out.println("Langamin, this is where you may find the comments in java");

        /*
         * Multi line comment
         * Calculating subtraction and multiplication
         */
        int a = 20;
        int b = 10;

        int difference = a - b; // subtraction
        int product = a * b;    // multiplication

        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
    }

    /**
     * Describes the multiply method below
     * @param x First number
     * @param y Second number
     * @return The product of x and y
     */
    public static int multiply(int x, int y) {
        return x * y;
    }
}