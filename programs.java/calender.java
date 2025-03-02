/**
 * calender2024-07-22024-07-22
 */

    import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class calender {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String userInput = scanner.nextLine();

        try {
            // Parse the user input to a LocalDate object
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(userInput, formatter);

            // Get the day of the week from the LocalDate object
            String dayOfWeek = date.getDayOfWeek().toString();

            System.out.println("The day of the week for " + userInput + " is: " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter a date in the format YYYY-MM-DD.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

// import java.time.DayOfWeek;
// import java.time.LocalDate;
// import java.util.Scanner;

// public class calender {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a date (YYYY-MM-DD): ");
//         String userInput = scanner.nextLine();

//         LocalDate date = LocalDate.parse(userInput);
//         DayOfWeek dayOfWeek = date.getDayOfWeek();

//         System.out.println("The day of the week for " + userInput + " is: " + dayOfWeek);
        
//         scanner.close();
//     }
// }
