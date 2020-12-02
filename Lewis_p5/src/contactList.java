import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;


public class contactList extends contactItem{
    private static ArrayList<String> firstNameList = new ArrayList<String>();
    private static ArrayList<String> lastnameList = new ArrayList<String>();
    private static ArrayList<String> phoneNumberList = new ArrayList<String>();


    public void main() {
        final Formatter x;
        try {
            x = new Formatter("test.txt");
        } catch (Exception e) {
            System.out.println("There was an error");
        }
    }

    protected static void contactList() {
            System.out.println(completeContactList);
    }


    public static void contactMenu() {
        contactApp m = new contactApp();
        System.out.println("\nContact Menu:\n");
        try {
            System.out.println("(1) view the list \n(2) add an item \n(3) edit an item \n(4) remove an item\n(5)save the current list \n(6) quit to main menu \n");

            Scanner userDecided = new Scanner(System.in);
            int userDecision = userDecided.nextInt();
            switch (userDecision) {
                case 1: //view list method
                    System.out.println("Viewing list...");
                    contactList();
                    contactMenu();
                    break;
                case 2: //add item method
                    System.out.println("Adding item...\n\n");
                    for(int i=0; i <= 1000; i++)
                    addContactFunction(i);
                    contactMenu();
                    break;
                case 3: //edit item method
                    System.out.println("Editing item...\n");
                    editFunction();
                    contactMenu();
                    break;
                case 4: //remove item method
                    System.out.println("removing item...\n");
                    rmFunction();
                    contactMenu();
                    break;
                case 5: //mark an item as completed
                    System.out.println("You chose: mark item as completed");
                    contactMenu();
                    break;
                case 6: //unmark an item as complete
                    System.out.println("Enter index of incomplete task: \n");
                    Scanner scan = new Scanner(System.in);
                    int indexOfitem = scan.nextInt();
                    contactMenu();
                case 7: //save current list
                    System.out.println("You chose: save the current list");
                    //subMenu();
                    contactMenu();
                    break;
                case 8: //quit to main menu
                    contactMenu();
                    break;
                default:
                    System.out.println("ERROR\nEnter valid input.\n");
                    //subMenu();
            }

        } catch (InputMismatchException b) {
            System.out.println("Invalid input. It definitely says an option 1-8. Stop wasting our time Choose a number between 1-8");
            //subMenu();

        }


    }

    protected static void editFunction() {
        System.out.println(completeContactList);
        System.out.println("Edit which name? Enter number:");
        Scanner index = new Scanner(System.in);
        int theIndex = index.nextInt();
        //edit first name list,
        // then last name list,
        // then phone list,
        // then set them to variable to add to complete contact list
        Scanner newTaskTitle = new Scanner(System.in);
        String newFirstName = newTaskTitle.nextLine();
        Scanner nDesc = new Scanner(System.in);
        String lastName = nDesc.nextLine();
        firstNameList.set(theIndex, newFirstName);
        lastnameList.set(theIndex, lastName);
    }
    private static String editlastNameFunc(int theIndex){
        //print index only before first name
        System.out.println("\nYou entered:\n" + theIndex + "\nnew task title:");
        System.out.println(firstNameList + "\n" + lastnameList +"\n Which name?");
        Scanner anotherIndexscan = new Scanner(System.in);
        int anotherIndex = anotherIndexscan.nextInt();
        System.out.println("Enter new name:\n");
        Scanner newStringScan = new Scanner(System.in);
        String varAnotherIndex = newStringScan.next();
        lastnameList.set(anotherIndex, varAnotherIndex);
        return varAnotherIndex;
    }

    private static String editfirstNameFunc(int theIndex){
        //print index only before first name

        System.out.println("\nYou entered:\n" + theIndex + "\n");
        System.out.println(firstNameList +"\n Which name?");
        Scanner anotherIndexscan = new Scanner(System.in);
        int anotherIndex = anotherIndexscan.nextInt();
        System.out.println("Enter new name:\n");
        Scanner newStringScan = new Scanner(System.in);
        String varAnotherIndex = newStringScan.next();
        firstNameList.set(anotherIndex, varAnotherIndex);
        return varAnotherIndex;
    }

    private static String editPhoneFunc(int theIndex){
        System.out.println("\nYou entered:\n" + theIndex + "\n");
        System.out.println(phoneNumberList +"\n Which name?");
        Scanner anotherIndexscan = new Scanner(System.in);
        int anotherIndex = anotherIndexscan.nextInt();
        System.out.println("Enter new number:\n");
        Scanner newStringScan = new Scanner(System.in);
        String varAnotherIndex = newStringScan.next();
        phoneNumberList.set(anotherIndex, varAnotherIndex);
        return varAnotherIndex;
    }

    private static void saveContactFunc(){

    }





    private static String varTaskList(int indexOfComplete) {
        return varTaskList(indexOfComplete);
    }

}
