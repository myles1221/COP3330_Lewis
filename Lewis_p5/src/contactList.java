import java.time.LocalDate;
import java.util.ArrayList;
import java.util.*;


public class contactList extends contactItem{
    private static ArrayList<String> firstNameList = new ArrayList<String>();
    private static ArrayList<String> lastnameList = new ArrayList<String>();
    private static ArrayList<String> phoneNumberList = new ArrayList<String>();
    private static ArrayList<String> eMailList = new ArrayList<String>();

    protected static Scanner ScanInput = new Scanner(System.in);

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
                        addContactFunction();
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
    protected static void rmFunction() {
        //removing something from the file
        System.out.println("Select Item to remove: \n");
        System.out.println(completeContactList);
        Scanner rmItem = new Scanner(System.in);
        int indexOfrmItem = rmItem.nextInt();
        completeContactList.remove(indexOfrmItem);
    }
    protected static void addContactFunction() {
        //add to file
        System.out.println("First name:");
        Scanner scan1 = new Scanner(System.in);
        String firstName = ScanInput.nextLine();
        System.out.println("Last name:\n");
        Scanner scan2 = new Scanner(System.in);
        String lastName = scan2.nextLine();
        System.out.println("Phone Number:\n");
        Scanner scan3 = new Scanner(System.in);
        String numberoPhone = scan3.nextLine();
        inputNumber();
        System.out.println("Email address:\n");
        Scanner scan4 = new Scanner(System.in);
        String eMail = scan4.nextLine();
        String completeContact = firstName + "\n" + lastName + "\n" + numberoPhone + "\n" + eMail;
        firstNameList.add(firstName);
        lastnameList.add(lastName);
        phoneNumberList.add(numberoPhone);
        eMailList.add(eMail);
        completeContactList.add(completeContact);
    }
        protected static void editFunction(){


            System.out.println(completeContactList);
            System.out.println("Edit which name? Enter number:");
            int theIndex = ScanInput.nextInt();
            String newFirstName = ScanInput.nextLine();
            String lastName1 = ScanInput.nextLine();
            String phone = ScanInput.nextLine();
            String emailadd = ScanInput.nextLine();
            firstNameList.set(theIndex, newFirstName);
            lastnameList.set(theIndex, lastName1);
            phoneNumberList.set(theIndex, phone);
            eMailList.set(theIndex, emailadd);
        }


    }
