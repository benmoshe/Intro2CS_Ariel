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
			System.out.println(i+") "+sh[i].toString()+"  type: "+sh[i].getClass().getSimpleName());
		}
		for(int i=0;i<4;i=i+1) {
			sh[i].move(p);
			System.out.println(i+") "+sh[i].toString());
		}
		Object t1 = new String("abc"); // aka = "abc";
		System.out.println(t1.toString()+"  "+t1.getClass().getName()+"  "+(t1 instanceof String));
		t1 = new String[2]; 
		System.out.println(t1+"  "+(t1 instanceof String));
		//int a = 4;
		t1 = new int[3][2];// new Integer(4);
		System.out.println(t1.toString());
		t1 = null;
		System.out.println(t1);
		String p_str = p.toString();
		p_str = "dsffsdfd";
		Point2D p2 = new Point2D(p_str);
		
		Circle2D c1 = new Circle2D(p2, 2);
	}

}
