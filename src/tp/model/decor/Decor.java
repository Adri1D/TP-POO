package tp.model.decor;

import java.awt.Point;

public class Decor {
	protected Point coord;
	
	Decor(Point coord){
		this.coord = new Point(coord);
	}
	
	Decor(){
		this(new Point(0,0));
	}

	public Point getCoord() {
		return coord;
	}

	public void setCoord(Point coord) {
		this.coord = coord;
	}
	
}
