package myProject;
import java.util.Scanner;

public class Addition_Table_App {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number from 3 to 20: ");
        int number = userinput.nextInt();

        // Validate input
        if (number < 3 || number > 20) {
            System.out.println("Invalid input. Please enter a number between 3 and 20.");
            return;
        }

        // Print header row
        System.out.printf("%4s", "+");
        for (int i = 1; i <= number; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        // Print table using nested loops
        for (int row = 1; row <= number; row++) {
            System.out.printf("%4d", row); // Row label

            for (int col = 1; col <= number; col++) {
                System.out.printf("%4d", row + col);
            }

            System.out.println();
        }

        userinput.close();
    }
}
