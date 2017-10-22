/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_planner;
import java.util.*;
/**
 *
 * @author Derp_dot_2
 */
public class Menu_Planner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Loading...");
        Scanner scan = new Scanner(System.in);
        
        Menu Menu = new Menu();
        FileHandler NewFile = new FileHandler();
        String userInput = "";
        String tempString = "";
        Menu.DisplayMainMenu();
        while(!"stop".equals(userInput))
        {
        
        userInput = "";
        userInput = scan.next();
        tempString = userInput.toLowerCase();
        userInput = tempString;
            switch(userInput)
            {
            case "new":
                NewFile.New();
                NewFile.Edit();
            break;
            case "load":
                Menu.DisplayLoadMenu();
                userInput = scan.next();
                tempString = userInput.toLowerCase();
                userInput = tempString;
            break;
            case "close":
                System.out.println("Closing Meal Planner.");
                System.exit(0);
            break;
            default:
            System.out.println("Error: not an option.");
            break;
            }
        Menu.DisplayMainMenu();//Disable in future.
        }
        
    }
    
    
}
