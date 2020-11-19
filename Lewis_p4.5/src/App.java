import java.awt.*;
import java.io.FileWriter;
import java.util.*;
import java.io.File;


public class App extends TaskList {
    static int pink, blue;
    public static void main(String[] args) {
        App m= new App();
        int blue = enterData(pink);
        if (blue == 1) {
            subMenu();
        } else if (blue == 2) {
            //run method for loading list
            System.out.println("Loading List...\n\n");
            //[Load List Method]
        } else if (blue == 0) {
            //exit program
            System.out.println("exiting program...");
            System.exit(0);
        }

    }

    public static int enterData(int pink) {
        try {
            System.out.println("(1)Create new list\n(2)Load existing list\n(3)Quit \n");
            Scanner InputScan = new Scanner(System.in); //scanner for user
            int moreInput = InputScan.nextInt(); //convert scanner to string
            switch (moreInput) {
                case 1:
                    //create new list code
                    System.out.println("You selected: Create new list\n");
                    //send user into submenu
                    pink = 1;
                    subMenu();
                    return pink;
                case 2:
                    //load existing list
                    System.out.println("You Selected: Load existing list\n");
                    enterData(pink);
                    pink = 2;
                    return pink;
                case 3:
                    //quit program
                    System.out.println("Exiting program...");
                    pink = 0;
                    return pink;
                default:
                    System.out.println("Enter a number 1-3");
                    enterData(pink);
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. \n\nEnter a number 1-3.");
            enterData(pink);
        }
        return pink;
    }
    private int pink(){
        return this.pink;
    }

    public void createTask(){
        System.out.println("Enter filename: \n");
        try{
            Scanner nameOfFile = new Scanner(System.in);
            String FileNameIs = nameOfFile.nextLine();
            FileNameIs = System.getProperty("user.dir") + "\\" + nameOfFile.nextLine();
            new FileWriter(FileNameIs, true);

        }catch(Exception j){

        }
    }

}