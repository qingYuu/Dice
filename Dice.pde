void setup()
{
	size(400,400);
	noLoop();
}
void draw()
{  background(255, 255, 255);
	int sum=0;
	for(int i = 50; i<=355; i=i+50)
	{
		for(int k =50; k<=355; k=k+50)
		{
			Die mattsun = new Die(i,k);
			mattsun.show();
			sum =sum+ mattsun.mRandom;
		    
		}
	}
	fill(0,0,0);
	textSize(30);
	text("Total dots" + sum, 200,400);
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
		mRandom = (int)(Math.random()*6)+1;
	}
	void roll()
	{
		mRandom = (int)(Math.random()*6)+1;
	}
	void show()
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
