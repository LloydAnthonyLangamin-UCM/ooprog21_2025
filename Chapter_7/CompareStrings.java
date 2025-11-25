import java.util.Scanner;

public class CompareStrings {

    public static void main(String[] args) {

        final String PREDEFINED_STRING = "Carmen";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name > ");
        String userInput = scanner.nextLine();

        if (userInput.equals(PREDEFINED_STRING)) {

            System.out.println(PREDEFINED_STRING + " equals " + userInput);
        } else {

            System.out.println(PREDEFINED_STRING + " does not equal " + userInput);
        }

        scanner.close();
    }
}