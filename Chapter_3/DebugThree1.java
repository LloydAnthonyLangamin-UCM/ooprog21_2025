// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        double check1;
        double check2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble(); // Changed from input.nextInt() to input.nextDouble() to support decimal values

        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble(); // Fixed typo 'inputnextInt()' to 'input.nextDouble()'

        calcTip(check1); 
        calcTip(check2);
    }

    // Added 'double bill' as a parameter to receive input values
    public static void calcTip(double bill) {
        final double RATE = 0.15; // Fixed typo 'doubel' to 'double'
        double tip;
        tip = bill * RATE; // Incorrect formula 'bill / RATE' should be 'bill * RATE'
        System.out.println("The tip should be at least $" + tip);
    }
}
