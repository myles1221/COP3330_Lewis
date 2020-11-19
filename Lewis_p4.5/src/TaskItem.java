import java.util.Date;
import java.util.Scanner;

public abstract class TaskItem {


    String taskTitle;
    String description;
    String date;



    /*task list shall contain an item
    task item shall contain a title
        title must be 1< in length
    task item shall contain a description
        description must be 0=< characters in length
    task item shall contain a due date
        due date shall be in format YYYY-MM-DD

     */

    // create the item
    public String TaskItem(){
        this.taskTitle = taskTitle;
        this.description = description;
        //this.date = date;
        return taskTitle;
    }
    protected void createItem(){

    }

    public void inputDate(){
        System.out.println("Enter year");
        Scanner yearDate = new Scanner(System.in);
        Scanner monDate = new Scanner(System.in);
        Scanner dayDate = new Scanner(System.in);
        System.out.println("Date entered:" + yearDate + "/" + monDate + "/" + dayDate);
    }




}
