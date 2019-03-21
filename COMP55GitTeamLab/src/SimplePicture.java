//comment one
//another comment but not two
//is this comment? no
import java.awt.Color;
import java.awt.Font;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	//William Was doing this haha
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		int temp = 90;
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
		GLabel label = new GLabel("I like cheese and pizza", 200, 400);
		label.setColor(Color.BLUE);
		label.setFont("Arial");
	    ++temp;
		add(label);
	}
}