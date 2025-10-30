// Display every character between Unicode 65 and 122
// Start new line after 20 characters
import java.util.Scanner;

public class DebugSix2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char letter;
        int a;
        int min; // removed 'final' so it can take user input
        final int MAX = 122;
        final int NUMBERLINE = 20;
        int count = 0; // new counter for how many characters printed

        System.out.println("Enter a Unicode value to start.");
        System.out.print("For example, A is 65 >> ");
        min = keyboard.nextInt();

        for (a = min; a <= MAX; a++) {
            letter = (char) a;
            System.out.print(" " + letter);
            count++; // count each printed character

            if (count == NUMBERLINE) { // changed = to == for comparison
                System.out.println(); // added missing semicolon
                count = 0; // reset counter after 20 characters
            }
        }
        System.out.println("\nEnd of application");
    }
}