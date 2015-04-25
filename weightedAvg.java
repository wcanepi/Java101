/**********************************************************************************

*  File: weightedAvg.java

*  Date: 4/19/2015

*  This GUI program allows the user to enter 4 test scores and their respective weights.
   The program will calculate and display the weighted average when the user presses the
   Calc Average button. The program will exit when the user presses the Exit button.
   
**********************************************************************************/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class weightedAvg extends JFrame {
   
   // Set the width and height of GUI
   private static final int WIDTH = 400;
   private static final int HEIGHT = 225;
   
   // Declare the JLabel, the JTextField, and the JButton objects
   private JLabel tscore1L, tscore2L, tscore3L, tscore4L, weight1L, weight2L, weight3L, weight4L, avgL, spacerL, spacer2L, spacer3L;
   private JTextField tscore1TF, tscore2TF, tscore3TF, tscore4TF,weight1TF, weight2TF, weight3TF, weight4TF, avgTF;
   private JButton exitB, calcAvgB;
   private CalcButtonHandler caHandler;
   private ExitButtonHandler ebHandler;

   
   public weightedAvg(){
  
   
    
      
      // Assign JLabel objects
      tscore1L = new JLabel("Test Score 1 ", SwingConstants.RIGHT);
      tscore2L = new JLabel("Test Score 2 ", SwingConstants.RIGHT);
      tscore3L = new JLabel("Test Score 3 ", SwingConstants.RIGHT);
      tscore4L = new JLabel("Test Score 4 ", SwingConstants.RIGHT);
      weight1L = new JLabel("Weight 1", SwingConstants.RIGHT);
      weight2L = new JLabel("Weight 2", SwingConstants.RIGHT);
      weight3L = new JLabel("Weight 3", SwingConstants.RIGHT);
      weight4L = new JLabel("Weight 4", SwingConstants.RIGHT);
      avgL = new JLabel("Average ", SwingConstants.RIGHT);
      spacerL = new JLabel("", SwingConstants.RIGHT);
      spacer2L = new JLabel("", SwingConstants.RIGHT);
      spacer3L = new JLabel("", SwingConstants.RIGHT);
      
      // Create the text fields for input -- field initialized with "0")
      tscore1TF = new JTextField("0",5);
      tscore2TF = new JTextField("0",5);
      tscore3TF = new JTextField("0",5);
      tscore4TF = new JTextField("0",5);
      weight1TF = new JTextField("0",5);
      weight2TF = new JTextField("0",5);
      weight3TF = new JTextField("0",5);
      weight4TF = new JTextField("0",5);
      avgTF = new JTextField("0",5);
      
      // Create Calc Button
      calcAvgB = new JButton("Calc Average");
      caHandler = new CalcButtonHandler();//Instantiate the object
      calcAvgB.addActionListener(caHandler);
      
      
      // Create Exit Button
      exitB = new JButton("Exit");
      ebHandler = new ExitButtonHandler();//Instantiate the object
      exitB.addActionListener(ebHandler);
      
      // Set GUI window title
      setTitle("Weighted Average Calculator"); 
      
      // Get the container
      Container pane = getContentPane();
      pane.setLayout(new GridLayout(6,3));
      
      // Position objects in pane
      pane.add(tscore1L);
      pane.add(tscore1TF);
      pane.add(weight1L);
      pane.add(weight1TF);
      pane.add(tscore2L);
      pane.add(tscore2TF);
      pane.add(weight2L);
      pane.add(weight2TF);
      pane.add(tscore3L);
      pane.add(tscore3TF);
      pane.add(weight3L);
      pane.add(weight3TF);
      pane.add(tscore4L);
      pane.add(tscore4TF);
      pane.add(weight4L);
      pane.add(weight4TF);
      
      pane.add(avgL);
      pane.add(avgTF);
      pane.add(spacerL);
      pane.add(spacer2L);
      pane.add(spacer3L);
      pane.add(calcAvgB);
      pane.add(exitB);
      
      //Set the size of window and display it
      setSize(WIDTH, HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   private class CalcButtonHandler implements ActionListener
   // Listens for events on the Calc Button and tells what to do when button is pressed
         
      {public void actionPerformed(ActionEvent e){
      
         double tscore1, tscore2, tscore3, tscore4, avg, weight1, weight2, weight3, weight4;
      
         tscore1 = Double.parseDouble(tscore1TF.getText());
         tscore2 = Double.parseDouble(tscore2TF.getText());
         tscore3 = Double.parseDouble(tscore3TF.getText());
         tscore4 = Double.parseDouble(tscore4TF.getText());
      
         weight1 = Double.parseDouble(weight1TF.getText());
         weight2 = Double.parseDouble(weight2TF.getText());
         weight3 = Double.parseDouble(weight3TF.getText());
         weight4 = Double.parseDouble(weight4TF.getText());
      
         avg = (tscore1*weight1+tscore2*weight2+tscore3*weight3+tscore4*weight4);
         avgTF.setText("" + String.format("%.1f",avg));}
      
         }
                    
            private class ExitButtonHandler implements ActionListener
            // Listens for events on the Exit Button and closes GUI when button is pressed
           
                {public void actionPerformed(ActionEvent e)
                     {
                          System.exit(0);
                     }
                }
                 public static void main(String[] args)
                 
                {
                     // Renders new GUI window
                     weightedAvg testObject = new weightedAvg();
                }
   }//End






