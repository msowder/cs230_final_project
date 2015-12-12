/* FILENAME: Recipe.java
 * AUTHORS: Magdalena Sowder, Michelle Duan, Elizabeth Kysel
 * COMMENTS: CS 230 Final Project What Should I Eat?
 * DATE: Dec 9 2015
 */

// IDEA: SCANNER IN BOTH, BASICALLY RECIPE COLLECTION PASSES IN A CHUNK OF THE FILE THAT RECIPE READS?????

import java.util.*;

public class Recipe {
  
  // Instance variables
  private String title;
  private String imageUrl;
  private LinkedList<String> ingredients;
  private int numIngredients;
  private String directions;
  
  // should imageUrl be a param?
  public Recipe (String newTitle, String newImageUrl, LinkedList<String> newIngredients, String newDirections) {
    title = newTitle;
    imageUrl = newImageUrl;
    ingredients = newIngredients;
    numIngredients = countIngredients(ingredients);
    directions = newDirections;
  }
  
  // Helper method to get numIngredients
  private int countIngredients (LinkedList<String> list) {
    return list.size();
  }
  
  /*
   * Getters for the Recipe
   */
  public String getTitle () {
    return title;
  }
  
  public String getImageUrl () {
    return imageUrl;
  }
  
  public LinkedList<String> getIngredients () {
    return ingredients;
  }
  
  public int getNumIngredients () {
    return numIngredients;
  }
  
  public String getDirections () {
    return directions;
  }
  
  public static void main(String[] args) {
    
  }
}