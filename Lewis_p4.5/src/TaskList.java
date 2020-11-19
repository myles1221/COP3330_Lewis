import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;


public class TaskList extends TaskItem {
    private static ArrayList<String> varTaskList = new ArrayList<String>();
    private static ArrayList<String> completedTaskList = new ArrayList<String>();
    private static ArrayList<String> uncompletedTaskList = new ArrayList<String>();
    private static ArrayList<String> descTaskList = new ArrayList<String>();
    int indexOfComplete;
    //take items from TaskItem and create txt file
    LocalDate dueDate;

    public void main() {
        final Formatter x;
        try {
            x = new Formatter("test.txt");
        } catch (Exception e) {
            System.out.println("There was an error");
        }
    }

    public static void taskList() {
        System.out.println(varTaskList);
    }

    public void dueDate(String dueDate) {
        this.dueDate = LocalDate.parse(dueDate);
    }

    public static void subMenu() {
        App m = new App();
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
                    addFunction();
                    subMenu();
                    break;
                case 3: //edit item method
                    System.out.println("Editing item...\n");
                    editFunction();
                    subMenu();
                    break;
                case 4: //remove item method
                    System.out.println("removing item...\n");
                    rmFunction();
                    subMenu();
                    break;
                case 5: //mark an item as completed
                    System.out.println("You chose: mark item as completed");
                    subMenu();
                    break;
                case 6: //unmark an item as complete
                    System.out.println("You chose: unmark item as completed");
                    unmarkFunction();
                    subMenu();
                case 7: //save current list
                    System.out.println("You chose: save the current list");
                    subMenu();
                    break;
                case 8: //quit to main menu
                    m.enterData(userDecision);
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

    public static void viewFunction() {
        //view current task list

        String viewTaskList = "current tasks: \n";
        for (int i = 1; i < varTaskList.size(); i++) {
            System.out.print("(" + i + ")" + varTaskList.get(i) + "\n");
        }

        System.out.println("incomplete tasks:\n" + uncompletedTaskList + "\n");
        System.out.print(theCompletedTaskList());

    }

    /*task list shall contain an item
    task item shall contain a title
        title must be 1< in length
    task item shall contain a description
        description must be 0=< characters in length
    task item shall contain a due date
        due date shall be in format YYYY-MM-DD

     */
    public static void editFunction() {

        System.out.println("Select line to change");
        Scanner index = new Scanner(System.in);
        int theIndex = index.nextInt();
        System.out.println("\nYou entered:\n" + theIndex + "\nnew task title:");
        Scanner newTaskTitle = new Scanner(System.in);
        String newTitle = newTaskTitle.nextLine();
        Scanner nDesc = new Scanner(System.in);
        String newDesc = nDesc.nextLine();
        varTaskList.set(theIndex, newTitle);
        descTaskList.set(theIndex, newDesc);
    }

    private static void addFunction() {
        //add to file
        String titleTask, descTask;

        System.out.println("Enter task title:");
        Scanner scan1 = new Scanner(System.in);
        titleTask = scan1.nextLine();
        System.out.println("Enter task description:\n");
        descTask = scan1.nextLine();
        descTask = "\n " + descTask;
        varTaskList.add(titleTask);
        uncompletedTaskList.add(titleTask);
        descTaskList.add(descTask);
    }

    private static void rmFunction() {
        //removing something from the file
        System.out.println("Select Task to remove: \n");
        System.out.println(varTaskList);
        Scanner rmItem = new Scanner(System.in);
        int indexOfrmItem = rmItem.nextInt();
        varTaskList.remove(indexOfrmItem);
        descTaskList.remove((indexOfrmItem));

        //print item at index being removed


    }

    public static void unmarkFunction() {
        //show list of unmarked and list of marked
        String completionMark = "$$$$$";
        System.out.println("Enter index of incomplete task: \n");
        Scanner scan = new Scanner(System.in);
        int indexOfitem = scan.nextInt();

        uncompletedTaskList.remove(indexOfitem);
        System.out.println("Item removed.\ncurrent Task List:" + uncompletedTaskList);

        int i, j;
        //for(j = 0; j < getObjectSize.completedTasks; j++)//for loops to print out uncompleted tasks
        //for(i = 0; i < sizeOf.completedTasks; i++) //for loops to print out completed tasks

    }

    public void markAsCompleted() {
        System.out.println("Enter index of completed task:\n");
        Scanner completed = new Scanner(System.in);
        indexOfComplete = completed.nextInt();
        String completedTask = varTaskList(indexOfComplete);
        completedTaskList.add(completedTask);
        System.out.println(completedTaskList);
    }

    private String varTaskList(int indexOfComplete) {
        return this.varTaskList(indexOfComplete);
    }

    public static boolean theCompletedTaskList(){
        System.out.println("********** completed *********" + completedTaskList + "\n***************************");
        return false;
    }
}