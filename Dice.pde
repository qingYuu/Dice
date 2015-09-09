void setup()
{
	noLoop();
}
void draw()
{ 

	Die mattsun = new Die(40,40);
	mattsun.show();
    
}
void mousePressed()
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
	void roll()
	{
		mRandom = (int)(Math.random()*7);
	}
	void show()
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
