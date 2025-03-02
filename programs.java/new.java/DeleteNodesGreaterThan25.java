import java.util.LinkedList;
import java.util.Scanner;

public class DeleteNodesGreaterThan25 {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Get elements from the user
        getInputFromUser(linkedList);

        // Display the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Delete nodes with values greater than 25
        deleteNodesGreaterThan25(linkedList);

        // Display the modified linked list
        System.out.println("Linked List after deleting nodes greater than 25: " + linkedList);
    }

    public static void getInputFromUser(LinkedList<Integer> linkedList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements for the linked list (enter a negative number to stop):");

        int input;
        do {
            System.out.print("Enter element: ");
            input = scanner.nextInt();

            if (input >= 1 && input <= 50) {
                linkedList.add(input);
            } else if (input < 0) {
                break; // Stop taking input if a negative number is entered
            } else {
                System.out.println("Invalid input. Enter a number in the range of 1-50.");
            }

        } while (true);

        scanner.close();
    }

    public static void deleteNodesGreaterThan25(LinkedList<Integer> linkedList) {
        LinkedList<Integer> nodesToRemove = new LinkedList<>();

        for (int value : linkedList) {
            if (value > 25) {
                nodesToRemove.add(value);
            }
        }

        linkedList.removeAll(nodesToRemove);
    }
}
