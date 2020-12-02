import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class contactItem extends TaskApp{
    protected static ArrayList<String> completeContactList = new ArrayList<String>();
    private static String firstName;
    private static String lastName;
    private static String eMail;
    private static String numberoPhone;
    protected static void addContactFunction() {
        //add to file
        System.out.println("First name:");
        Scanner scan1 = new Scanner(System.in);
        firstName = scan1.nextLine();
        System.out.println("Last name:\n");
        Scanner scan2 = new Scanner(System.in);
        lastName = scan2.nextLine();
        System.out.println("Phone Number:\n");
        Scanner scan3 = new Scanner(System.in);
        numberoPhone = scan3.nextLine();
        System.out.println("Phone number: \n");
        inputNumber();
        System.out.println("Email address:\n");
        Scanner scan4 = new Scanner(System.in);
        eMail = scan4.nextLine();
        String completeContact = firstName + "\n" + lastName + "\n" + numberoPhone + "\n" + eMail;
        completeContactList.add(completeContact);
    }

    protected static void rmFunction() {
        //removing something from the file
        System.out.println("Select Item to remove: \n");
        System.out.println(completeContactList);
        Scanner rmItem = new Scanner(System.in);
        int indexOfrmItem = rmItem.nextInt();
        completeContactList.remove(indexOfrmItem);
        //print item at index being removed
    }

}