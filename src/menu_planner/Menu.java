/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu_planner;

/**
 *
 * @author Derp_dot_2
 */
public class Menu{
    
    
    public void DisplayMainMenu()
    {
        System.out.print("\n"+
        "=====Main Menu================================\n" +
        "     New\n" +
        "     Load\n" +
        "     Close\n" +
        "==============================================\n" +
        "  What would you like to do? >: ");
    }
    
    public void DisplayLoadMenu()
    {
        FileHandler Files = new FileHandler();
        System.out.println("=====Load File================================");
        Files.ListPlannerFiles();
        System.out.print("=============================================="
                + "\nSelect File >: ");
    }
    
    public void DisplayFileEditOptions()
    {
        System.out.print("\n=====File Edit Options========================\n"
                         + "     Save Menu\n"
                         + "     Discard Changes\n"
                         + "     Change File\n"
                         + "==============================================\n"
                         + "What would you like to do? >: ");      
    }
    
}
