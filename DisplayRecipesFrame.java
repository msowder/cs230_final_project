/* IngredientsFrame.java
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
 
public class DisplayRecipesFrame extends JPanel {
  //declare private objects 
  private JPanel resultLabelPanel, resultPanel /*checkBoxLabelPanel, checkBoxPanel,contentPane*/;
  private JLabel;
  private RecipeCollection<Recipes> collection;
  int numRecipes; //to be instantiated later on using collection (how many recipes will display)
  
  // Constructor
  // Note: Constructor takes instance of RecipeCollection as input
  public DisplayRecipesFrame(RecipeCollection queue){
    
    this.collection = queue;
    // sets the layout of the panel to vertical box layout
    setLayout(new BoxLayout (this, BoxLayout.Y_AXIS));
    //setPreferredSize(new Dimension(400,400));
    
    //***initialize numRecipes;
    
    
    //gets size of priority queue
    int size = collection.size();
    //sets size of numRecipes
    if (size>5 || size==5) {
      numRecipes = 5;
    } else {
      numRecipes = size;
    }
    
    resultLabelPanel = new JPanel();
    resultLabel = new JLabel("You can make: " + numRecipes + ". ");
    resultLabelPanel.add(resultLabel);
    resultPanel = new JPanel();
    //adds these recipe titles 
    for (int i=0; i < numRecipes; i++) {
      resultPanel.add(collection.peek());
      collection.remove(collection.peek());
    }
    
    
    
    adds all the subpanels to the IngredientsFrame  and sets their perspective positions within the panel
    add(resultLabelPanel, BorderLayout.NORTH);
    add(resultPanel, BorderLayout.SOUTH);
    
  }
 
  // --------------------------------------------------
  // Represents the change listener for the check boxes
  // NOTE: does not implement any event, because the information 
  // received will be used during the event of the displayButton being pushed
  // --------------------------------------------------
 }
