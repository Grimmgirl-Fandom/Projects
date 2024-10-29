//A+ Computer Science  -  www.apluscompsci.com
//Name -Grace Hollis
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class GaySnow extends AbstractShape
{
   public GaySnow(int x, int y, int wid, int ht, Color col)
   {
  super(x, y, wid, ht, col.WHITE, 0, 0);


   }

   public void draw(Graphics window)
   {

     window.setColor(getColor().WHITE);
     window.fillRect(getXPos(),getYPos(),getWidth(),getHeight());
     window.setColor(getColor().RED);
     window.fillRect(getXPos()/8,getYPos(),175,25);
     window.setColor(getColor().ORANGE);
     window.fillRect(getXPos()/8,getYPos()+25,175,25);
     window.setColor(getColor().YELLOW);
     window.fillRect(getXPos()/8,getYPos()+50,175,25);
     window.setColor(getColor().GREEN);
     window.fillRect(getXPos()/8,getYPos()+75,175,25);
     window.setColor(getColor().CYAN);
     window.fillRect(getXPos()/8,getYPos()+100,175,25);
     window.setColor(getColor().BLUE);
     window.fillRect(getXPos()/8,getYPos()+125,175,25);
     window.setColor(getColor().MAGENTA);
     window.fillRect(getXPos()/8,getYPos()+150,175,25);



    
     


   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}