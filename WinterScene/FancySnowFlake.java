//A+ Computer Science  -  www.apluscompsci.com
//Name -Grace Hollis
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

//extend the AbstractShape class to make a FancySnowFlake class

public class FancySnowFlake extends AbstractShape
{
    public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
  super(x, y, wid, ht, col, xSpd, ySpd);


   }
   public void draw(Graphics window)
   { 
     window.setColor(getColor().white);
     window.fillOval(getXPos(),getYPos(),getWidth(),getHeight());
   }

   public void moveAndDraw(Graphics window)
   {
     if (getYPos()==600)
      setYPos(0);
       else
      setYPos(getYPos()+1);
     
       
       
      draw(window);
      
   }
}
