import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

public void setup()
{
	size(400,400);
	noLoop();
}
public void draw()
{ 
for(int i = 50; i<=400; i=i+50)
{
	for(int k =50; k<=400; k=k+50)
	{
	Die mattsun = new Die(i,k);
	mattsun.show();
	}
	
	}
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int mX, mY, mRandom;
	Die(int x, int y) 
	{
		mX = x;
		mY = y;
		mRandom = (int)(Math.random()*6)+1;
	}
	public void roll()
	{
		mRandom = (int)(Math.random()*6)+1;
	}
	public void show()
	{  
        fill(247, 59, 59);
		rect(mX-20, mY-20, 50, 50,5);
		if(mRandom == 1)
		{
			fill(255, 255, 255);
			ellipse(mX+5,mY+5,10,10);
		}
		if(mRandom == 2)
		{
			fill(255, 255, 255);
			ellipse(mX-10,mY-10,10,10);
			ellipse(mX+20,mY+20,10,10); //second dot
		}
		if(mRandom == 3)
		{
			fill(255, 255, 255);
			ellipse(mX-10,mY-10,10,10);
			ellipse(mX+5,mY+5,10,10); // center dot
			ellipse(mX+20,mY+20,10,10);
        }
        if(mRandom == 4)
        {
        	fill(255, 255, 255);
        	ellipse(mX-10,mY-10,10,10);
        	ellipse(mX-10,mY+20,10,10);//corner dot 1
        	ellipse(mX+20,mY-10,10,10);//corner dot 2
            ellipse(mX+20,mY+20,10,10);

        }
        if(mRandom == 5)
        {
        	fill(255, 255, 255);
        	ellipse(mX-10,mY-10,10,10);
        	ellipse(mX-10,mY+20,10,10);
        	ellipse(mX+5,mY+5,10,10); //center dot
        	ellipse(mX+20,mY-10,10,10);
            ellipse(mX+20,mY+20,10,10);
        }
        if(mRandom == 6)
        {
        	fill(255, 255, 255);
        	ellipse(mX-10,mY-10,10,10);
        	ellipse(mX-10,mY+20,10,10);
        	ellipse(mX-10,mY+5,10,10);
        	ellipse(mX+20,mY+5,10,10);
        	ellipse(mX+20,mY-10,10,10);
            ellipse(mX+20,mY+20,10,10);
        }




	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
