import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class contactItem extends TaskApp{
    protected static ArrayList<String> completeContactList = new ArrayList<String>();
    private static String firstName;
    private static String lastName;
    private static String eMail;
    private static String numberoPhone;
    private static ArrayList<String> firstNameList = new ArrayList<String>();
    private static ArrayList<String> lastnameList = new ArrayList<String>();
    private static ArrayList<String> phoneNumberList = new ArrayList<String>();
    private static ArrayList<String> eMailList = new ArrayList<String>();



        //print item at index being removed

    public void addContactCon(String firstName){
        this.firstName = firstName;
    }
    public static boolean isPhoneValid(String number){
        Pattern pattern = Pattern.compile("^(\\d{3}[-]?){2}\\d{4}$");
        Matcher matcher = pattern.matcher(number);
        if(number.trim().equals("")) {
            return true;
        }else{
            return false;
        }

    }

}