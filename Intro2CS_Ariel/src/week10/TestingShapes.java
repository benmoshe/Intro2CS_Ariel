package week10;

public class TestingShapes {

	public static void main(String[] args) {
		GeoShape[] sh = new GeoShape[4];
		Point2D p = new Point2D(1,0.3);
		sh[0] = p;
		sh[1] = new Point2D(-1,3);
		sh[2] = new Circle2D(p, 2.5);
		sh[3] = sh[2].copy();
		for(int i=0;i<4;i=i+1) {
			System.out.println(i+") "+sh[i].toString());
		}
		for(int i=0;i<4;i=i+1) {
			sh[i].move(p);
			System.out.println(i+") "+sh[i].toString());
		}
	}

}
