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
public class FileEdit extends FileHandler{
    
    Scanner scan = new Scanner(System.in);
    String userInput = "";
    String lowerConvert = "";
    String[][] mealsPerDay = new String [7][4];
    String [] mealType = new String[3];
    String fileInput = null;
    
    
    public void DaySelect()
    {
        for(int x = 0;x<1;x++)
        {
            userInput = "";
            System.out.print("\nWhich day to you want to edit? >:");
            userInput = scan.next();
            lowerConvert = userInput.toLowerCase();
            userInput = lowerConvert;
        
            switch(userInput)
            {
                case "sunday":
                    MealInput(0);
                break;
            
               case "monday":
                    MealInput(1);
                break;
            
                case "tuesday":
                    MealInput(2);    
                break;
            
               case "wednesday":
                    MealInput(3);    
                break;
            
                case "thursday":
                    MealInput(4);    
                break;
            
                case "friday":
                    MealInput(5);    
                break;
            
                case "saturday":
                    MealInput(6);    
                break;
            
                default:
                    System.out.println("Error: Incorrect input. Type full day.");
                    x-=1;
                break;
            }
            
        }
    }
    
    public void MealInput(int daySelect)
    {
        InitializeMealsPerDay();
        InitializeMealType();
        
        for(int x = daySelect;x <= 6;x++)
        {
            System.out.println("==============================================");
            System.out.println(mealsPerDay[x][0] + " meals input: ");
            for(int y = 1; y<=3; y++)
            {
                System.out.print("\n" + mealType[y-1] + ": >:");
                userInput = scan.next();
                mealsPerDay[x][y] = userInput;
            }
        }
    }
    
    public void DisplayMeals()
    {
        for(int x = 0; x<=6; x++)
        {
            System.out.println("\n==============================================");
            System.out.println();
            for(int y = 1; y <= 3; y++)
            {
                System.out.print(" | " + mealType[y-1] + ": " + mealsPerDay[x][y]);
            }
        }
        System.out.println("\n==============================================");
    }
    
    
    
    public void InitializeMealsPerDay()
    {      
        for(int x = 0;x <=6;x++)
        {
            for(int y = 1; y<=3; y++)
            {
                mealsPerDay[x][y] = null;
            }
        }
        mealsPerDay[0][0] = "Sunday";
        mealsPerDay[1][0] = "Monday";
        mealsPerDay[2][0] = "Tuesday";
        mealsPerDay[3][0] = "Wednesday";
        mealsPerDay[4][0] = "Thursday";
        mealsPerDay[5][0] = "Friday";
        mealsPerDay[6][0] = "Saturday";
    }
    
    public void InitializeMealType()
    {
        mealType[0] = "breakfast";
        mealType[1] = "lunch";
        mealType[2] = "dinner";
    }
    
    public void PrepareFileInput()
    {

        for(int x = 0;x <= 6;x++)
        {
            fileInput = "==============================================\n";
            fileInput += "Day: " + mealsPerDay[x][0];
            for(int y = 1; y<=3; y++)
            {
                fileInput += "\n | " + mealType[y-1] + ": " + mealsPerDay[x][y];
            }
            fileInput += "\n==============================================";
        }
        System.out.println("fileInput: \n" + fileInput);
    }
    

    
    
}
