import java.util.Arrays;

public class ArraysDemo {

    // Method to display the array with formatting
    public static void display(String message, int array[]) {
        System.out.printf("%-22s", message);  // Align messages
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int numbers[] = {0, 0, 0, 0, 0}; // To match the screenshot output

        // Display original array values
        display("Original array:", numbers);

        // Filling the array with 8s
        Arrays.fill(numbers, 8);
        display("After filling with 8s:", numbers);

        // Changing two values
        numbers[3] = 6;
        numbers[4] = 3;
        display("After changing two values:", numbers);

        // Sorting the array
        Arrays.sort(numbers);
        display("After sorting:", numbers);
    }
}
