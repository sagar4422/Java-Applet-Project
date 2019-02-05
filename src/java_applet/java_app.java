package java_applet;

import java.applet.*;
import java.awt.*;

public class java_app extends Applet{
	
	public void init() {
		
		
	}
	
	public void stop()
	{
		
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 400, 400);
		
		g.setColor(Color.GREEN);
		g.drawRect(20, 20, 30, 50);
		
		g.setColor(Color.RED);
		g.drawOval(60, 70, 20, 50);
		g.fillOval(20, 10, 20, 50);
	}

}
