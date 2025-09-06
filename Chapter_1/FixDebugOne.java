public class FixDebugOne
{
    /* This program displays a greeting */
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}

/*
List down the spotted bugs below:
E.g.
// wrong syntax for access modifier "publlic" instead of "public"

Bugs:
1. Class identifier — Use FixDebugOne (no spaces). If the class is public the source file must be named FixDebugOne.java.
2. Method name Java is case-sensitive: the method must be main (lowercase), not Main.
3. An incorrect argument list should have a "[]" in it; "(String[] args)" should be used in place of "(String args)".
4. System spelling — You likely had Systm (misspelt). It should be System.
5. The statement terminator ";" is missing; System.out.println("Hello World!"); should be used instead.
*/
