//A+ Computer Science  -  www.apluscompsci.com
//Name -Grace Hollis
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsRunner extends JFrame
{
 private static final int WIDTH = 800;
 private static final int HEIGHT = 600;

 public GraphicsRunner()
 {
  super("THE WINTER SCENE PROJECT"); 
  setSize(WIDTH,HEIGHT);
    
  getContentPane().add(new WinterScenePanel());    
  
  setVisible(true);
 }
 
 public static void main( String args[] )
 {
  GraphicsRunner run = new GraphicsRunner();


 }
}