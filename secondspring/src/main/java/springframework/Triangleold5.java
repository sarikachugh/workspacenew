package springframework;

import java.util.List;

public class Triangleold5 {

/*	private Point pointA;
	private Point pointB;
	private Point pointC;*/
	
	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		for (Point point: points){
			System.out.println("Point = (" + point.getX() + ", " + point.getY() + ")");
		}
				
	}

}
