///* IngredientsFrame.java
// */
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.event.*;
//import javax.swing.*;
//import java.awt.BorderLayout;
//import java.awt.GridLayout;
//import javax.swing.BorderFactory;
//import javax.swing.BorderFactory;
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
// 
// 
//public class DisplayRecipesFrame extends JPanel {
//  //declare private objects 
//  private JPanel resultLabelPanel, resultPanel /*checkBoxLabelPanel, checkBoxPanel,contentPane*/;
//  private JLabel resultLabel;
//  private RecipeCollection collection;
//  int numRecipes; //to be instantiated later on using collection (how many recipes will display)
//  
//  // Constructor
//  // Note: Constructor takes instance of RecipeCollection as input
//  public DisplayRecipesFrame(RecipeCollection queue){
//    
//    this.collection = queue;
//    // sets the layout of the panel to vertical box layout
//    setLayout(new BoxLayout (this, BoxLayout.Y_AXIS));
//    //setPreferredSize(new Dimension(400,400));
//    
//    //***initialize numRecipes;
//    
//    
//    //gets size of priority queue
//    int size = collection.size();
//    //sets size of numRecipes
//    if (size>5 || size==5) {
//      numRecipes = 5;
//    } else {
//      numRecipes = size;
//    }
//    
//    resultLabelPanel = new JPanel();
//    resultLabel = new JLabel("You can make: " + numRecipes + ". ");
//    resultLabelPanel.add(resultLabel);
//    resultPanel = new JPanel();
//    //adds these recipe titles 
//    for (int i=0; i < numRecipes; i++) {
//      Recipe recipe = collection.peek();
//      //resultPanel.add(recipe.toString());
//      collection.remove();
//    }
//    
//    
//    
//    //adds all the subpanels to the IngredientsFrame  and sets their perspective positions within the panel
//    add(resultLabelPanel, BorderLayout.NORTH);
//    add(resultPanel, BorderLayout.SOUTH);
//    
//  }
// 
//  // --------------------------------------------------
//  // Represents the change listener for the check boxes
//  // NOTE: does not implement any event, because the information 
//  // received will be used during the event of the displayButton being pushed
//  // --------------------------------------------------
// }
//

/*Anne Schwartz and MAgdalena Sowder
 * PSET 5
 * AboutPanel.java
 */

//creates a panel with information about how to use this application 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayRecipesFrame extends JPanel {
  private JLabel text, title, pumpkin; //instance variables for JLabels
  private RecipeCollection recipes;
  
  public DisplayRecipesFrame(RecipeCollection recipes) {
    //makes a JLabel with an HTML div and adds text to it and centers the text
    title = new JLabel("<html><div style=\"text-align: center;\">Choose the Best Graduate School<br>for YOU!</html>", SwingConstants.CENTER);
    
    //makes a new JLabel with an HTML div and adds text to it with line breaks
    text = new JLabel("<html><div style=\"text-align: center;\">This program was created by Magdalena Sowder and Anne Schwartz. <br>This program can help you find a good grad"
                        + " school for you. <br>In the Add Panel of this application you can rate the schools you are interested"
                        + " in and add them to a list of schools. <br>In the Evaluate Panel, you can rank the importance you place on" 
                        + " the quality of <br>academics, research, and publications of your preferred school. <br>With this information the application will"
                        + " display the school that is best for you!</html>");
    
    //sets the font type and size and color of the JLabels
    title.setFont(new Font("Courier", Font.PLAIN, 36));
    title.setForeground(Color.red);
    
    text.setFont(new Font("Times", Font.PLAIN, 18));
    text.setForeground(Color.blue);
    
    //adds an image to the panel
    add(new JLabel(new ImageIcon("pumpkin.png")));

    //adds the labels to the panel 
    add(title);
    add(text);
    //sets the size and background color of the panel
    setPreferredSize(new Dimension(850, 300));
    setBackground(Color.yellow);
  }
}
