/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_planner;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Derp_dot_2
 */
public class FileHandler extends Menu{
    

    String filePath = "C:\\Users\\Derp_dot_2\\Desktop\\Programming\\Application - The Hub\\Menu_Planner\\MealPlanner_Output\\";
    
    
    public void New()
    {
        File newMenu = null;
        
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.uuuu-HH.mm.ss");
        String dateAndTime = now.format(formatter);
        
        String newFileName = "Untitled-Menu_" + dateAndTime + ".txt";
        
        
        try
        {
            newMenu = new File(filePath + newFileName);
            newMenu.createNewFile();//figure out why this is bool/how createNewFile() works.
            System.out.println("\nCreating new file: " + newMenu.getName());
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void Load(String fileName)
    {
        
        try
        {
            FileReader load = new FileReader(filePath + fileName);
            BufferedReader reader = new BufferedReader(load);
            
            String display = "";
            
                System.out.println("Reading...");
            while((display = reader.readLine()) != null)
            {
                System.out.println(display);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }   
    }
    public void Edit()
    {
        FileEdit EditFile = new FileEdit();
        EditFile.DaySelect();
        EditFile.DisplayMeals();
        EditFile.PrepareFileInput();
    }

    public void Save()
    {
        
    }
    
    public void Close()
    {
        //Add function to close open file
        Menu FileList = new Menu();
        System.out.println("File closed.");
        FileList.DisplayLoadMenu();
    }
    
        public void ListPlannerFiles()
    {
        File file = null;
        String[] paths;
        try//figure out why this works/what try{}Catch does.
        {
            file = new File("C:\\Users\\Derp_dot_2\\Desktop\\Programming\\Application - The Hub\\Menu_Planner\\MealPlanner_Output");
            paths = file.list();
            for(String path:paths)
            {
                System.out.println(path);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
