package menu_planner;
import java.io.*;

public class FileProcessing{
    private String filePath = "C:\\Users\\Derp_dot_2\\Desktop\\Programming\\Application - The Hub\\Menu_Planner\\MealPlanner_Output\\";
    private Menu menu;
    
    public void New(){
        File newMenu = null;
        String newFileName = "";

        try{
            newMenu = new File(filePath + newFileName);
            newMenu.createNewFile();
            System.out.println("\nCreating new file: " + newMenu.getName());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void Load(String fileName){
        try{
            FileReader load = new FileReader(filePath + fileName);
            BufferedReader reader = new BufferedReader(load);
            
            String display = "";
            
            System.out.println("Reading...");
            while((display = reader.readLine()) != null)
                System.out.println(display);
            
        }
        catch(Exception e){
            e.printStackTrace();
        }   
    }
    
    public void Edit(){
        DataProcessing EditFile = new DataProcessing();
        EditFile.DaySelect();
        EditFile.DisplayMeals();
        EditFile.PrepareFileInput();
    }

    public void Save(){
        
    }
    
    public void Close(){
        //Add function to close open file
        Menu FileList = new Menu();
        System.out.println("File closed.");
        FileList.DisplayLoadMenu();
    }
    
    public void ListPlannerFiles(){
        File file = null;
        String[] paths;
        try{
            file = new File(filePath);
            paths = file.list();
            for(String path:paths)
                System.out.println(path);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
