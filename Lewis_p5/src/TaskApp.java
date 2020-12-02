import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskApp extends TaskList {

    static int pink;

    public void taskAppMenu(String[] args) {

    }

    public static void subMenu() {
        contactApp m = new contactApp();
        System.out.println("\nChoose an option.\n");
        try {
            System.out.println("(1) view the list \n(2) add an item \n(3) edit an item \n(4) remove an item \n(5) mark an item as completed \n(6)unmark an item as completed \n(7)save the current list \n(8) quit to main menu \n");

            Scanner userDecided = new Scanner(System.in);
            int userDecision = userDecided.nextInt();
            switch (userDecision) {
                case 1: //view list method
                    System.out.println("Viewing list...\n");
                    viewFunction();
                    System.out.println("\n");
                    subMenu();
                    break;
                case 2: //add item method
                    System.out.println("Adding item...\n\n");
                    addTaskFunction();
                    subMenu();
                    break;
                case 3: //edit item method
                    System.out.println("Editing item...\n");
                    editFunction();
                    subMenu();
                    break;
                case 4: //remove item method
                    System.out.println("removing item...\n");
                    rmTaskFunction();
                    subMenu();
                    break;
                case 5: //mark an item as completed
                    System.out.println("You chose: mark item as completed");
                    markAsCompleted();
                    break;
                case 6: //unmark an item as complete
                    System.out.println("You chose: unmark item as completed");
                    System.out.println("Enter index of incomplete task: \n");
                    Scanner scan = new Scanner(System.in);
                    int indexOfitem = scan.nextInt();
                    unmarkFunction(indexOfitem);
                    subMenu();
                case 7: //save current list
                    System.out.println("You chose: save the current list");
                    saveText();
                    System.out.println("\n...\nFile saved");
                    break;
                case 8: //quit to main menu

                    taskMenu(userDecision);
                    break;
                default:
                    System.out.println("ERROR\nEnter valid input.\n");
                    subMenu();
            }

        } catch (InputMismatchException b) {
            System.out.println("Invalid input. It definitely says an option 1-8. Stop wasting our time Choose a number between 1-8");
            subMenu();

        }

    }
}
