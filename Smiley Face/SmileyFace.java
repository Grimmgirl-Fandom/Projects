//(c) A+ Computer Science
//www.apluscompsci.com

//Name -grace Hollis
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
      
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
    
   {
     Color myFeet = new Color (189, 140, 155);
     Color brightPink = new Color (219, 64, 106);
     Color lightPink = new Color (253,120,173);
     Color earOne = new Color (246,212,200);
     Color innerEar=new Color(162,43,65);
     Color pinkFace = new Color(246,83,126);
     Color horn = new Color(186,116,57);
     Color innerFace = new Color(186,151,157);
     Color sMile = new Color(133,92,44);
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);
//feet
     
window.setColor(myFeet);
window.fillOval( 291, 508, 55, 57 );
window.fillOval( 411, 502, 78, 88 );
                
  //body
window.setColor(brightPink);
window.fillOval(363,238,186,308);
window.fillRect(262,311,116,60);
window.fillRect(312,481,144,64);
window.fillOval(252,298,154,250);
window.setColor(lightPink);
window.fillOval(414,52,36,46);
window.setColor(earOne);
window.fillOval(160,181,44,33);
window.fillOval(175,175,26,23);
window.fillOval(430,54,10,35);
window.fillOval(415,60,18,24);
window.fillOval(424,55,12,11);
window.setColor(innerEar);
window.fillOval(160,184,35,37);
window.fillOval(175,203,17,12);
window.setColor(pinkFace);
window.fillOval(185,49,304,304);
window.fillOval(184,31,265,199);


//horn
window.setColor(horn);
window.fillOval(272,67,52,66);
window.fillOval(279,50,24,44);
  window.fillOval(283,6,41,95);
  //face
  window.setColor(innerFace);
  window.fillOval(318,216,69,99);
    window.fillOval(291,231,117,83);
    window.fillOval(241,192,99,86);
    window.fillOval(371,174,74,77);
    window.fillOval(342,221,69,76);
window.fillOval(328,213,50,18);

//face continued
window.setColor(Color.black);
window.fillOval(406,202,23,31);
 window.fillOval(252,223,27,34);
  window.setColor(sMile);
 window.fillOval(329,233,51,21);
 window.fillOval(353,245,42,40);
   window.fillOval(311,249,56,33);
   window.setColor(innerFace);
   window.fillOval(332,226,43,21);
   window.fillOval(360,251,40,28);
   window.fillOval(308,250,44,27);
   window.fillRect(327,236,26,28);
   window.fillRect(361,234,35,35);
   window.setColor(Color.white);
   window.fillOval(420,209,4,4);
     window.fillOval(260,231,5,7);
   
  
  

                }
}