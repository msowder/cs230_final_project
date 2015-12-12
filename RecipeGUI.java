/* 
 * CS 230, Fall 2015
 *
 * 
 */


import javax.swing.*;
import java.awt.*;
import java.util.*;

public class RecipeGUI {
  //declare private objects 
  private RecipeCollection allRecipes;
  private LinkedList pantry;
  
  public RecipeGUI(){
    //sets the title for the fram of the GUI
    JFrame frame = new JFrame("What will I eat today?");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // determines that when the close button is pressed, it will terminate the program
    RecipeCollection recipes = new RecipeCollection("recipes.txt"); // creates new instance of RecipeCollection
    
    // creates a tabbed pane, the panel on each Tab demonstrates separate functions that are connected
    JTabbedPane tp = new JTabbedPane(); 
    tp.addTab ("Ingredients", new IngredientsFrame(allRecipes)); // allIngredients is a linkedlist of all the ingredients 
    //tp.addTab ("Display Recipes", new DisplayRecipesFrame(recipes)); // recipes is a 
    
    frame.getContentPane().add(tp);// gets content pane of the frame and abbs the tabbed pane to the frame
    frame.pack(); // sets the size of the frame to appropriately contain the panel within
    frame.setVisible(true);// setVisible method allows the frame to be displayed on the monitor screen
  }
  
  // Main method that creates and displays the main program frame conatianing a tabbed paneRecipe
  public static void main (String[] args){
    RecipeGUI test= new RecipeGUI();
  }
}