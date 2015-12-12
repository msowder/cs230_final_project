/* Michelle Duan and Brookefieldman
 * CS 230, Fall 2015
 * Assignment 3
 * Task 3: GradSchoolGUI.java 
 * Purpose: Sets up the frame and panel that contain the other panels
 * It communicates with the GradSchools.java class where the 
 * ability to rate and rank the schools porperly
 * resides.
 */


import javax.swing.*;


public class RecipeGUI {
 //declare private objects 
 private static RecipeCollection allIngredients;
 
  
 // Main method that creates and displays the main program frame conatianing a tabbed paneRecipe
 public static void main (String[] args){
   
   //sets the title for the fram of the GUI
  JFrame frame = new JFrame("What will I eat today?");
  frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // determines that when the close button is pressed, it will terminate the program
  RecipeCollection recipes = new RecipeCollection(); // creates new instance of RecipeCollection
  
   
  // creates a tabbed pane, the panel on each Tab demonstrates separate functions that are connected
  JTabbedPane tp = new JTabbedPane(); 
  tp.addTab ("Ingredients", new IngredientsFrame(allIngredients)); // allIngredients is a linkedlist of all the ingredients 
  tp.addTab ("Display Recipes", new DisplayRecipesFrame(recipes)); // recipes is a 

  frame.getContentPane().add(tp);// gets content pane of the frame and abbs the tabbed pane to the frame
  frame.pack(); // sets the size of the frame to appropriately contain the panel within
  frame.setVisible(true);// setVisible method allows the frame to be displayed on the monitor screen
  }
 }