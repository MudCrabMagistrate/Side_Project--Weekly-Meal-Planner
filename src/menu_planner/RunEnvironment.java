/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_planner;

import java.util.Scanner;

/**
 *
 * @author Derp_dot_2
 */
public class RunEnvironment {
    
public void MealPlanner()
{
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
                Menu.DisplayFileEditOptions();
                userInput = scan.next();
                tempString = userInput.toLowerCase();
                userInput = tempString;
            break;
            case "load":
                Menu.DisplayLoadMenu();
                userInput = scan.next();
                tempString = userInput.toLowerCase();
                userInput = tempString;
                NewFile.Load(userInput);
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
