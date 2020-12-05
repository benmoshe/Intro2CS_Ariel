/**
 * This class represents a 2D point in the plane.
 * Our first example of Object Oriented Programming
 */

package week8;

public class Point { // the class name should be the same name as the .java file
   
    private double _x;  // private data members
    private double _y;
    
    /**
     * Constructor
     * @param a
     * @param b
     */
    public Point(double a,double b) {
    	_x=a; _y=b;
    }
   
    /** 
     * Getter for x
     * @return
     */
    public double x() {return _x;}
    public double y() {return _y;}
 
  /** Add a vector */
    public Point2D add(Point2D p) {
    	Point2D a = new Point2D(p.x()+x(),p.y()+this.y());
    	return a;
    }

    public String toString()
    {
        return _x+","+_y;
    }

    public double distance(Point p2)
    {
        double dx = this.x() - p2.x();
        double dy = this.y() - p2.y();
        double t = (dx*dx+dy*dy);
        return Math.sqrt(t);
    }


    public boolean close2equals(Point p2, double eps)
    {
        return ( this.distance(p2) < eps );
    }
  
    public static void main(String[] args) {
    	Point p1 = new Point(1,2);
    	Point p2 = new Point(5,5);
    	double dist = p1.distance(p2);
    	System.out.println("The distance is: "+dist);
   
    }
}
