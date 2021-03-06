package test;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class EarthquakeCityMap extends PApplet {
	
	private UnfoldingMap map;
	
	public void setup() {
		
		size(950, 600, OPENGL);
		map = new UnfoldingMap(this, 200, 50, 700, 500, new Google.GoogleMapProvider());
		map.zoomToLevel(2);
	    MapUtils.createDefaultEventDispatcher(this, map);
	   /*
	    Location valLoc = new Location(-38.14f, -73.03f);
	    Marker val = new SimplePointMarker(valLoc);
	    map.addMarker(val);
	    */

	}
	
	public void draw() {
		
		
		map.draw();
		addKey();
		drawButtons();
		//   mouseReleased ();            Try to uncomment this line

	}
	
	
	public void drawButtons() {
		
	    
	    fill(255, 255, 255);
	    rect(100, 100, 25, 25);
	    fill(100, 100, 100);
	    rect(100, 150, 25, 25);
		
		
	}
	
	public void mouseReleased () {
		if(mouseX > 100 && mouseX < 125 && mouseY > 100 && mouseY < 125) {
			background(255, 255, 255);
		}else if(mouseX > 100 && mouseX < 125 && mouseY > 150 && mouseY < 175) {
			background(100, 100, 100);
		}
		
		
	}
	
	private void addKey() 
	{	
		// Remember you can use Processing's graphics methods here
	
	}


}
