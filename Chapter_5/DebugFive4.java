// DebugFive4.java
// Outputs highest of four numbers

import java.util.*;

public class DebugFive4
{
    public static void main(String args[])
    {
        int one, two, three, four;
        int highest;

        Scanner input = new Scanner(System.in);

        // Previously, all inputs were stored in "one"
        // Changed each prompt to use the correct variable
        System.out.print("Enter first integer >> ");
        one = input.nextInt();

        System.out.print("Enter second integer >> ");
        two = input.nextInt(); // used "two" instead of "one"

        System.out.print("Enter third integer >> ");
        three = input.nextInt(); // used "three" instead of "one"

        System.out.print("Enter fourth integer >> ");
        four = input.nextInt(); // used 'four' instead of 'one'

        // Logical comparisons corrected
        // The old code used some || (OR) and even == comparisons,

        if (one > two && one > three && one > four)
            highest = one; // one is greater than all others
        else if (two > one && two > three && two > four)
            highest = two; // replaced || with && 
        else if (three > one && three > two && three > four)
            highest = three; // changed == to > 
        else
            highest = four; // if none above, four is the highest

        // Output message corrected
        // printed clearly with variable
        System.out.println("The highest number is " + highest);
    }
}