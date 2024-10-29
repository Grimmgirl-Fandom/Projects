// A+ Computer Science  -  www.apluscompsci.com
//Name -Grace Hollis
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WinterScenePanel extends JPanel implements Runnable
{
 private AbstractShape[] shapes;  
 private AbstractShape sMan,ssMan,gay;
 

 public WinterScenePanel()
 {
  setVisible(true);
  //instantiate the array to hold 50 AbstractShape references
    shapes = new AbstractShape[100];
  //populate the array with 50 unique snowflakes
    for(int i = 0;i<100;i+=5)
    {
      shapes[i+0]= new FancySnowFlake(i*18+20,0,8,8,Color.WHITE,30,10);
      shapes[i+1]= new FancySnowFlake(i*18+20+2*i,-120,8,8,Color.WHITE,30,10);
      shapes[i+2]= new FancySnowFlake(i*18+15+3*i,-240,8,8,Color.WHITE,30,10);
      shapes[i+3]= new FancySnowFlake(i*18+18+4*i,-360,8,8,Color.WHITE,30,10);
      shapes[i+4]= new FancySnowFlake(i*18+24+5*i,-480,8,8,Color.WHITE,30,10);
    

      
      }

     
 
    
  
  //instantiate a snowman
    sMan = new SnowMan(500,400,200,200);  // to finish instantiating
    ssMan= new SnowMan(250,400,200,200);  // to finish instantiating
    gay = new GaySnow(200,130,10,700,Color.BLACK);
  
    
  
  new Thread(this).start();
 }
 
 public void update(Graphics window)
 {
  paint(window); 

 }

 public void paint(Graphics window)
 {
  window.setColor(Color.BLUE);
  window.fillRect(0,0,getWidth(), getHeight());
  window.setColor(Color.WHITE);
  window.drawRect(20,20,getWidth()-40,getHeight()-40);
  window.setFont(new Font("TAHOMA",Font.BOLD,18));
  window.drawString("MAKE A WINTER SCENE!",40,40);
  
  //make the snowman appear

  sMan.draw(window);   // to make it appear.
  ssMan.draw(window);   // to make it appear.
  gay.draw(window);

  //make the snowflakes appear and move down the screen
  for(int i = 0;i<50;i++)
    {
      shapes[i].moveAndDraw(window);
 
    }
  //check to see if any of the snowflakes need to be reset to the top of the screen
  
  
 }
 
   public void run()
   {
    try
    {
     while(true)
     {
        Thread.currentThread().sleep(35);
            repaint();
         }
      }catch(Exception e)
      {
      }
   } 
}