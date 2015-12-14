/* IngredientsFrame.java
 * 
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
 
 
public class IngredientsFrame extends JPanel {
  //declare private objects 
  private JPanel buttonPanel, checkBoxPanel /*checkBoxLabelPanel, checkBoxPanel,contentPane*/;
  private JButton displayButton;
  private RecipeCollection allRecipes; //presumes allIngredients is a collection of string objects
  private JCheckBox[] checkBox;
  String[] available;
  
  // Constructor
  // Note: Constructor takes instance of RecipeCollection as input
  public IngredientsFrame(RecipeCollection r){
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    
    this.allRecipes = r;
    // sets the layout of the panel to vertical box layout
    setLayout(new BoxLayout (this, BoxLayout.Y_AXIS));
    //setPreferredSize(new Dimension(400,400));
  
    // creates new subpanel within Evaluate panel
    JPanel checkBoxLabelPanel = new JPanel();
    //  creates new Label with text
    JLabel checkBoxLabel = new JLabel("Ingredients");
    // adds the label to the subpanel
    checkBoxLabelPanel.add(checkBoxLabel);
    
    JPanel contentPane = new JPanel();
    contentPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(new BorderLayout(5, 5));
    
    // creates new subpanel within the main ingredientsframe panel
    checkBoxPanel = new JPanel();
    checkBoxPanel.setLayout(new GridLayout(0, 4, 5, 5));
    //checkBox = new JCheckBox[allRecipes.size];
    checkBoxPanel = new JPanel();

    //for (int i = 0; i < allRecipes.size(); i++) {
      //checkBox[i] = new JCheckBox(allRecipes.get(i));
      //checkBoxPanel.add(checkBox[i]);
    //}
    contentPane.add(checkBoxPanel, BorderLayout.CENTER);
    
   
    // creates a CheckBoxListener 
    CheckBoxListener listener5 = new CheckBoxListener();
    //attaches each check box to the listener
    for (int i=0; i<checkBox.length; i++){
      checkBox[i].addItemListener(listener5);
    }
    
//DONE ABOVE    
//   // adds each check box to the checkBoxPanel
//    for (int i=0; i<checkBox.length; i++){
//      checkBoxPanel.add(checkBox[i]);
//    }

  
   
    // creates a new sub Panel in the Evaluate Panel
    buttonPanel = new JPanel();
    // creates a button with text label
    displayButton = new JButton ("Display Recipes");
    buttonPanel.add(displayButton); // adds button to buttonPanel subpanel
    displayButton.addActionListener(new ButtonListener()); //creates new listener for button
    contentPane.add(buttonPanel, BorderLayout.PAGE_END);
    frame.setContentPane(contentPane);
    frame.pack();
    frame.setLocationByPlatform(true);
    frame.setVisible(true);
    
    // adds all the subpanels to the IngredientsFrame  and sets their perspective positions within the panel
    add(checkBoxLabelPanel, BorderLayout.NORTH);
    add(checkBoxPanel, BorderLayout.NORTH);
    add(buttonPanel, BorderLayout.SOUTH);
    
  }
 
  // --------------------------------------------------
  // Represents the change listener for the check boxes
  // NOTE: does not implement any event, because the information 
  // received will be used during the event of the displayButton being pushed
  // --------------------------------------------------
  
  private class CheckBoxListener implements ItemListener {
    public void itemStateChanged (ItemEvent event) {
      }
  }

  // --------------------------------------------------
  // Represents the change listener for the Buttons
  // --------------------------------------------------
  
   private class ButtonListener implements ActionListener
    {
     // --------------------------------------------------
     // Gets all the checked checkboxes
     // --------------------------------------------------
   public void actionPerformed (ActionEvent event2)
      {
     //gets count of ingredients that are available
        int count = 0;
        for (int i=0; i<checkBox.length; i++){
          if (checkBox[i].isSelected()){
            count++;
          }
        }
        //adds all available ingredients to the available array
        available = new String[count];
        for (int i=0; i<checkBox.length; i++){
          if (checkBox[i].isSelected()){
            //available[i]=allRecipes.get(i);
          }
        }

      }
    }
 }
