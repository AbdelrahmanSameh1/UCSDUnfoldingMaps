package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
	public void setup() {         // this method called once 
		
		size(400, 400);
		background(200,200,200);
		
	}
	
	
	public void draw() {       // this method called continuously
		
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);
		fill(0,0,0);
		ellipse(120, 130, 50, 70);
		fill(0,0,0);
		ellipse(280, 130, 50, 70);
		arc(200, 280, 100, 75, 0, PI);
		noFill();          // it is remove the color of the arc
		
	}

}
