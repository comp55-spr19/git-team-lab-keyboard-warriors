//comment one
//another comment but not two
//is this comment? no
import java.awt.Font;

import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("robot.jpg", 200, 100);
		add(robot);
		//Trying to get my points for this lab!
		GLabel label = new GLabel("I like cheese", 200, 400);
		label.setFont("Arial");
		//neew change
	
		add(label);
	}
}