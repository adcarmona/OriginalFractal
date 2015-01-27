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

public class OriginalFractal extends PApplet {

public void setup()
{
	size(500, 500);
	background(0);
}
public void draw()
{
	myFractal(250,250,500);
}
public void myFractal(int x, int y, int fSize)
{
	if (fSize == 0)
	{

	}
	else
	{
		fill(255,255,255,10);
		ellipse(x, y, fSize, fSize);
	    ellipse(x + 50, y + 50, fSize/2, fSize/2);
	    ellipse(x - 50, y - 50, fSize/2, fSize/2);
	    ellipse(x - 50, y + 50, fSize/2, fSize/2);
	    ellipse(x + 50, y - 50, fSize/2, fSize/2);
	    ellipse(x, y + 100, fSize/3, fSize/3);
	    ellipse(x, y - 100, fSize/3, fSize/3);
	    ellipse(x - 100, y, fSize/3, fSize/3);
	    ellipse(x + 100, y, fSize/3, fSize/3);
	    line(x, y, x - fSize, y - y);
	    line(x, y, x + fSize, y + y);
	    line(x, y, x + x, y - fSize);
	    line(x, y, x - x, y + fSize);
		fSize = fSize - 5;
		myFractal(250,250,fSize);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
