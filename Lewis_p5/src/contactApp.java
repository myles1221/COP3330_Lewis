import java.awt.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.util.*;
import java.io.File;


public class contactApp extends contactList {
    static int blue;
    public static void main(String[] args) {
        contactApp m= new contactApp();
        int blue = contactOrTask();
        if (blue == 1) {
            contactMenu();
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

    public static int contactOrTask(){
        try {
            System.out.println("Would you like to enter a new contact, or a new task?\n");
            System.out.println("(1)Contact\n(2)Task\n(3)Exit program\n");
            Scanner scan1 = new Scanner(System.in);
            blue = scan1.nextInt();
        }catch(Exception whatever){
            System.out.println("ERROR\nEnter valid data");
        }
        return blue;
    }



//    private void loadFile(){
//        BufferedReader in = new BufferedReader(Reader in, int size);
//    }
}



