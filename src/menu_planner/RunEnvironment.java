package menu_planner;

import java.util.Scanner;

public class RunEnvironment {
    Scanner scan = new Scanner(System.in);
    Menu menu = new Menu();
    DataProcessing data = new DataProcessing();

    public void MealPlanner(){
        String userInput = "";

        while(!"stop".equals(userInput)){
            menu.DisplayMainMenu();
            
            userInput = "";
            data.ProcessInput(userInput = scan.next());
            
            switch(userInput){
            case "new":
                data.CreateWeeklyMenu(userInput);
            break;
            case "load":
                data.CreateWeeklyMenu(userInput);
            break;
            case "close":
                userInput = "stop";
            break;
            default:
                System.out.println("Error: not an option.");
            break;
            }
        }
    }
}
