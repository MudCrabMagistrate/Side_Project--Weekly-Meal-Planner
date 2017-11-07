package menu_planner;

public class Menu{
    FileProcessing Files = new FileProcessing();
    
    public void DisplayMainMenu(){
        System.out.print("\n"+
        "=====Main Menu================================\n" +
        "     New\n" +
        "     Load\n" +
        "     Close\n" +
        "==============================================\n" +
        "  What would you like to do? >: ");
    }
    
    public void DisplayLoadMenu(){
        System.out.println("=====Load File================================");
        Files.ListPlannerFiles();
        System.out.print("=============================================="
                + "\nSelect File >: ");
    }
    
    public void DisplayFileEditOptions(){
        System.out.print("\n=====File Edit Options========================\n"
                         + "     Save Menu\n"
                         + "     Discard Changes\n"
                         + "     Change File\n"
                         + "==============================================\n"
                         + "What would you like to do? >: ");      
    }
}
