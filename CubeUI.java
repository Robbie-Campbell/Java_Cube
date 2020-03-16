
// This Class will allow us to create a 
// User Interface Object for Cube

import javax.swing.*;               // JFrame, JPanel, JLabel, JTextField
                                    // JComboBox, JButton  Classes
import java.awt.*;                  // Font Class
import javax.swing.border.*;        // Border, BorderFactory Classes
import java.awt.event.*;            // ActionListener, ActionEvent

public class CubeUI implements ActionListener
{
   // Define attributes
   JFrame       frame;
   JPanel       mainPanel, topPanel, middlePanel,
                bottomPanel;
   Font         font1;
   JLabel       headingLabel, widthLabel, heightLabel, depthLabel, message1,
                message2, result;
   JTextField   widthTxtField, heightTxtField, depthTxtField;
   
   JButton      areaButton;
   Border       raisedBevelBorder, loweredBevelBorder;
   
   // Constructor
   CubeUI()
     {
         // Create frame
         frame = new JFrame("Calculate Cube Object Areas");
         // Position and size the frame
         frame.setBounds (10,20,500,500);
         
         // Build Font object
         font1 = new Font("TimesRoman", Font.BOLD, 30);
         
         // Create the two border objects
         raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
         loweredBevelBorder = BorderFactory.createLoweredBevelBorder();
         
         // Build all four panel objects
         mainPanel = new JPanel();
         topPanel = new JPanel();
         middlePanel = new JPanel();
         bottomPanel = new JPanel();
         
         // Apply Absolute Positioning on all
         // four Panels
         mainPanel.setLayout ( null );
         topPanel.setLayout ( null );
         middlePanel.setLayout ( null );
         bottomPanel.setLayout ( null );
         
         // Set up heading label object
         headingLabel = new JLabel("Cube-Based Application");
         // Apply font1 to headingLabel
         headingLabel.setFont ( font1 );
         
         // Apply a border to topPanel
         topPanel.setBorder ( raisedBevelBorder );
         // Apply a border to middlePanel
         middlePanel.setBorder ( loweredBevelBorder );
         // Apply a border to bottomPanel
         bottomPanel.setBorder ( raisedBevelBorder );
         
         // Size and position headingLabel
         headingLabel.setBounds (10,10, 350, 40);
         // Add headingLabel to topPanel
         topPanel.add (headingLabel);
         
         // Size and position topPanel
         topPanel.setBounds ( 30, 10, 400, 60 );
         // Add topPanel to the mainPanel
         mainPanel.add ( topPanel );
         
         // Set up width label
         widthLabel = new JLabel ("Cube Width ");
         // Size and position widthLabel
         widthLabel.setBounds ( 10, 30, 100, 25);
         // Place this label on middle panel
         middlePanel.add ( widthLabel );
         
         // Set up height label
         heightLabel = new JLabel("Cube Height ");
         // Size the position heightLabel
         heightLabel.setBounds (10, 75, 100, 25);
         // Place this label on the middle panel
         middlePanel.add ( heightLabel );
         
         // Set up the unit of depth label
         depthLabel = new JLabel ("Cube Depth ");
         // Size and position this component
         depthLabel.setBounds (10, 120, 150, 25);
         // Place this label on the middle panel
         middlePanel.add ( depthLabel );
         
         // Set up the width text field
         widthTxtField = new JTextField ("0");
         // Set bounds of this item
         widthTxtField.setBounds (140, 30, 100, 25);
         // Add this item to the middle panel
         middlePanel.add ( widthTxtField);
         
         // Set up the height text field
         heightTxtField = new JTextField ("0");
         // Set bounds for this item
         heightTxtField.setBounds (140, 75, 100, 25);
         // Add this item to the middle panel
         middlePanel.add ( heightTxtField );
         
         // Set up the depth text field
         depthTxtField = new JTextField ("0");
         // Set bounds of this item
         depthTxtField.setBounds (140, 120, 100, 25);
         // Add to the middle panel
         middlePanel.add ( depthTxtField );
         
         // Set up message1 label
         message1 = new JLabel();
         // Set the bounds for this item
         message1.setBounds (10, 145, 400, 25);
         // Add to middlepanel
         middlePanel.add ( message1 );
         
         // Set up message2 labe
         message2 = new JLabel ();
         // Set the bounds of message2
         message2.setBounds (10,165,300,25);
         // Add to the middlePanel
         middlePanel.add (message2);
         
         // Create areabutton
         areaButton = new JButton ("Calculate Cube Area");
         // Set bounds for button
         areaButton.setBounds (30, 300, 200, 30);
         // Add button to mainPanel
         mainPanel.add ( areaButton );
         
         // Register above button for an action event
         areaButton.addActionListener ( this );
                
         // Set the bounds of middlePanel
         middlePanel.setBounds (30, 80, 400, 200);
         // Add middlePanel to mainPanel
         mainPanel.add ( middlePanel);
         
         // Add mainPanel to frame
         frame.add ( mainPanel );
         // Make the frame visible
         frame.setVisible (true);
         // Create a result label
         
     }
    
    // Implement actionPerformed
    public void actionPerformed (ActionEvent event)
      {
        // Check if area button is pressed
        if ( event.getSource() == areaButton )
          {
              
              // Get the string values of the textfields
              String widthStr = widthTxtField.getText();
              String heightStr = heightTxtField.getText();
              String depthStr = depthTxtField.getText();
              
              
              // Convert the strings over to double values
              double width = Double.valueOf(widthStr);
              double height = Double.valueOf(heightStr);
              double depth = Double.valueOf(depthStr);
              
              
              // Create a Cube object
              Cube result = new Cube(width,height,depth);
              
              ///////////OUTPUT THE VALUES ON MESSAGE1////////////////
              message1.setText("Given Width = " + result.getWidth() + "cm, Height = " + result.getHeight() +
                                "cm, and Depth = " + result.getDepth() + "cm");
                                
              ///////////////OUTPUT THE AREA RESULT///////////////////
              message2.setText("The area is: " + result.area() + "cm^3");
              
              ///////////////RESET THE VALUES BACK TO 0///////////////
              width = 0;
              height = 0;
              depth = 0;
          }
      }
    
      
    // main() method
    public static void main()
      {
         // Build a CubeUI object
         CubeUI start = new CubeUI();
      }
}