// ***************************************************************
//   RecipeCollection.java         
//
//   
// ***************************************************************
import javafoundations.PriorityQueue;
import java.io.*;
import java.util.*;

public class RecipeCollection{
  
  //INSTANCE VARIABLES
  private PriorityQueue collection;
  private int size;
  
  //METHODS
  //constructors
  public RecipeCollection(){
    collection = new PriorityQueue();
    size = 0;
  }
  
  public RecipeCollection(String fileName){
    //read from file
    try {
      Scanner scan = new Scanner(new File(fileName));
      size = 0;
     
      //read recipes
      while (scan.hasNext()) {
        scan.nextLine();
        String recipeName= scan.nextLine();
        System.out.println("NAME " + recipeName);
        String ingredients = scan.nextLine();
        System.out.println("INGREDIENTS " + ingredients);
        LinkedList<String> ingredientList= createIngredients(ingredients);
        String imageURL = scan.nextLine();
        scan.nextLine();
        String directions = "";
        while (!scan.next().equals("#")){
          directions += scan.nextLine();
          directions += "\n";
        }
        System.out.println("DIRECTIONS" + directions);
        addRecipe(recipeName, ingredientList, imageURL, directions);
      }
    } catch (IOException ex){
      System.out.println("File not found.");
    }
  }
  
  
  public void addRecipe(String recipeName, LinkedList<String> ingredients, String imageUrl, String directions){
    Recipe newRecipe = new Recipe(recipeName, imageUrl, ingredients, directions);
    collection.enqueue(newRecipe); 
    size += 1;
  }
  
  public void addRecipe(Recipe toBeAdded){
    collection.enqueue(toBeAdded);
    size += 1;
  }
  
  private LinkedList<String> createIngredients(String firstIngredients) {
    LinkedList<String> newList = new LinkedList<String>();
    String[] split = firstIngredients.split(",");
    for (int i = 0; i < split.length; i++) {
      newList.add(split[i]);
    }
    System.out.println("NEWLIST " + newList);
    return newList;
  }
  
  public int size(){
    return size;
  }
  
  public Recipe peek(){
    result = collection.dequeue();
    collection.enqueue(result);
    return result;
  }
  
    
  public Recipe remove(){
    return collection.dequeue();
  }
  
  //main method for testing
  public static void main (String[] args) {
    RecipeCollection test = new RecipeCollection("recipes-small-star.txt");
  }
}
