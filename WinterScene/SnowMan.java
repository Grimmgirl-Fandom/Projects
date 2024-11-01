//A+ Computer Science  -  www.apluscompsci.com
//Name -Grace Hollis
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
  super(x, y, w, h, Color.WHITE, 0, 0);


   }

   public void draw(Graphics window)
   {
      //add code here to make a snowman 
     
     window.setColor(getColor().white);
     window.fillOval(getXPos(),getYPos(),getWidth(),getHeight());
     window.fillOval(getXPos()+30,getYPos()-115,getWidth()-60,getHeight()-60);
     window.fillOval(getXPos()+50,getYPos()-200,getWidth()-100,getHeight()-100);
     window.setColor(getColor().black);
     window.fillOval(getXPos()+50,getYPos()-200,getWidth()-100,30);
     window.fillRect(getXPos()+70,getYPos()-250,60,60);
     window.fillRect(getXPos()-50,getYPos()-50,80,7);
     window.fillRect(getXPos()+170,getYPos()-50,80,7);
     
     



    
     


   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}