import java.util.Date;
import java.util.Scanner;

public abstract class TaskItem{
    private static Scanner TheScanVariable;
    String taskTitle;
    String description;
    static String completeDate;



    /*task list shall contain an item
    task item shall contain a title
        title must be 1< in length
    task item shall contain a description
        description must be 0=< characters in length
    task item shall contain a due date
        due date shall be in format YYYY-MM-DD
     */

    // create the item
    protected String TaskItem(){
        this.taskTitle = taskTitle;
        this.description = description;
        //this.date = date;
        return taskTitle;
    }

    protected static String inputDate(){
        System.out.println("Enter Year\n");
        Scanner yearDate = new Scanner(System.in);
        String dateYear = yearDate.nextLine();
        System.out.println("Enter month\n");
        Scanner monDate = new Scanner(System.in);
        String dateMon = monDate.nextLine();
        System.out.println("Enter day");
        Scanner dayDate = new Scanner(System.in);
        String dateday = dayDate.nextLine();
        completeDate = "\n" + dateYear + "/" + dateMon + "/" + dateday;
        return completeDate;
    }

    protected static String inputNumber(){
        System.out.println("First name");
        Scanner firstThree = new Scanner(System.in);
        Scanner midThree = new Scanner(System.in);
        Scanner lastFour = new Scanner(System.in);
        String num =  firstThree + "-" + midThree + "-" + lastFour; //concatonate all strings
        return num;
    }




}
