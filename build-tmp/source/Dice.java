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
	noLoop();
}
public void draw()
{ 

	Die mattsun = new Die(40,40);
	mattsun.show();
    
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
		mRandom = (int)(Math.random()*7);
	}
	public void roll()
	{
		mRandom = (int)(Math.random()*7);
	}
	public void show()
	{  
        fill(247, 59, 59);
		rect(mX-20, mY-20, 30, 30,5);
		if(mRandom == 1)
		{
			fill(255, 255, 255);
			ellipse(mX-5,mY-5,10,10);
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
