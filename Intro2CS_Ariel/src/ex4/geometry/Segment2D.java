package ex4.geometry;

import ex4.Ex4_Const;
/**
 * This class represents a 2D segment on the plane, 
 * Ex4: you should implement this class!
 * @author I2CS
 *
 */
public class Segment2D implements GeoShape{
	@Override
	public boolean contains(Point2D ot) {
		return false;
	}

	@Override
	public Point2D centerOfMass() {
		return null;
	}

	/**
	 */
	@Override
	public double area() {
		return -1;
	}

	@Override
	public double perimeter() {
		return -1;
	}

	@Override
	public void move(Point2D vec) {;
	}

	@Override
	public GeoShape copy() {
		return null;
	}
	@Override
	public Point2D[] getPoints() {
		return null;
	}
	@Override
	public String toString() {
		return null;
	}
}