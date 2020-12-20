package ex4.tests;

import java.awt.Color;
import java.util.Scanner;

import ex4.Ex4;
import ex4.Ex4_Const;
import ex4.GUIShape;
import ex4.GUI_Shape;
import ex4.GUI_Shape_Collection;
import ex4.Shape_Comp;
import ex4.StdDraw;
import ex4.geometry.*;

/** 
 * This class represents a simple main which demonstrates the use of Ex4
 * with respect to creating geo and gui shapes, adding shapes to a GUI container,
 * using a GUI present the shapes and performing save and load.
 * 
 * output example:
 * ****************
 * Enter a sorting method (a number in [0-6]): 0
**** Sorting according to flag=0 ****
GUIShape,255,false,0,Point2D,0.2,0.4
GUIShape,16711680,true,1,Circle2D,0.1,0.2, 0.14
GUIShape,65280,true,2,Rect2D,0.1,0.2,0.5,0.45
GUIShape,65535,false,3,Rect2D,0.1,0.2,0.17,0.77
GUIShape,16762880,false,4,Triangle2D,0.8,0.7,0.3,0.65,0.1,0.1
GUIShape,16756655,false,5,Segment2D,0.2,0.6,0.7,0.2
GUIShape,8421504,false,6,Rect2D,-0.04000000000000001,0.06,0.8,0.77


Enter a sorting method (a number in [0-6]): 1
**** Sorting according to flag=1 ****
GUIShape,8421504,false,6,Rect2D,-0.04000000000000001,0.06,0.8,0.77
GUIShape,16756655,false,5,Segment2D,0.2,0.6,0.7,0.2
GUIShape,16762880,false,4,Triangle2D,0.8,0.7,0.3,0.65,0.1,0.1
GUIShape,65535,false,3,Rect2D,0.1,0.2,0.17,0.77
GUIShape,65280,true,2,Rect2D,0.1,0.2,0.5,0.45
GUIShape,16711680,true,1,Circle2D,0.1,0.2, 0.14
GUIShape,255,false,0,Point2D,0.2,0.4


Enter a sorting method (a number in [0-6]): 2
**** Sorting according to flag=2 ****
GUIShape,16756655,false,5,Segment2D,0.2,0.6,0.7,0.2
GUIShape,255,false,0,Point2D,0.2,0.4
GUIShape,65535,false,3,Rect2D,0.1,0.2,0.17,0.77
GUIShape,16711680,true,1,Circle2D,0.1,0.2, 0.14
GUIShape,65280,true,2,Rect2D,0.1,0.2,0.5,0.45
GUIShape,16762880,false,4,Triangle2D,0.8,0.7,0.3,0.65,0.1,0.1
GUIShape,8421504,false,6,Rect2D,-0.04000000000000001,0.06,0.8,0.77


Enter a sorting method (a number in [0-6]): 3
**** Sorting according to flag=3 ****
GUIShape,8421504,false,6,Rect2D,-0.04000000000000001,0.06,0.8,0.77
GUIShape,16762880,false,4,Triangle2D,0.8,0.7,0.3,0.65,0.1,0.1
GUIShape,65280,true,2,Rect2D,0.1,0.2,0.5,0.45
GUIShape,16711680,true,1,Circle2D,0.1,0.2, 0.14
GUIShape,65535,false,3,Rect2D,0.1,0.2,0.17,0.77
GUIShape,16756655,false,5,Segment2D,0.2,0.6,0.7,0.2
GUIShape,255,false,0,Point2D,0.2,0.4


Enter a sorting method (a number in [0-6]): 4
**** Sorting accurding to flag=4 ****
GUIShape,255,false,0,Point2D,0.2,0.4
GUIShape,16711680,true,1,Circle2D,0.1,0.2, 0.14
GUIShape,65535,false,3,Rect2D,0.1,0.2,0.17,0.77
GUIShape,16756655,false,5,Segment2D,0.2,0.6,0.7,0.2
GUIShape,65280,true,2,Rect2D,0.1,0.2,0.5,0.45
GUIShape,16762880,false,4,Triangle2D,0.8,0.7,0.3,0.65,0.1,0.1
GUIShape,8421504,false,6,Rect2D,-0.04000000000000001,0.06,0.8,0.77


Enter a sorting method (a number in [0-6]): 5
**** Sorting according to flag=5 ****
GUIShape,8421504,false,6,Rect2D,-0.04000000000000001,0.06,0.8,0.77
GUIShape,16762880,false,4,Triangle2D,0.8,0.7,0.3,0.65,0.1,0.1
GUIShape,65280,true,2,Rect2D,0.1,0.2,0.5,0.45
GUIShape,16756655,false,5,Segment2D,0.2,0.6,0.7,0.2
GUIShape,65535,false,3,Rect2D,0.1,0.2,0.17,0.77
GUIShape,16711680,true,1,Circle2D,0.1,0.2, 0.14
GUIShape,255,false,0,Point2D,0.2,0.4


Enter a sorting method (a number in [0-6]): 6
**** Sorting according to flag=6 ****
GUIShape,16711680,true,1,Circle2D,0.1,0.2, 0.14
GUIShape,16756655,false,5,Segment2D,0.2,0.6,0.7,0.2
GUIShape,16762880,false,4,Triangle2D,0.8,0.7,0.3,0.65,0.1,0.1
GUIShape,255,false,0,Point2D,0.2,0.4
GUIShape,65280,true,2,Rect2D,0.1,0.2,0.5,0.45
GUIShape,65535,false,3,Rect2D,0.1,0.2,0.17,0.77
GUIShape,8421504,false,6,Rect2D,-0.04000000000000001,0.06,0.8,0.77


Enter a sorting method (a number in [0-6]): -1
Done! bye bye..
 * 
 * @author boaz.benmoshe
 *
 */
public class Test_Ex4 {
	public static void main(String[] a) {
		test0();
	//	test1(); // 	once you compete the implementation you can try test1 as well
	//	test2(); // 	once you compete the implementation you can try test2 as well
	}
	public static void test0() {
		Point2D p1 = new Point2D(0.1,0.2);
		
		Circle2D c1 = new Circle2D(p1,0.14);
		//Rect2D r1 = new Rect2D(p1, new Point2D(0.5,0.45));
		//Rect2D r2 = new Rect2D(p1, new Point2D(0.17,0.77));
		Point2D a1 = new Point2D(0.8,0.7), a2 = new Point2D(0.3,0.65), a3 = new Point2D(0.1,0.1);;
		//Triangle2D t1 = new Triangle2D(a1,a2,a3);
		p1.move(p1);
		//Segment2D seg1 = new Segment2D(new Point2D(0.2,0.6), new Point2D(0.7,0.2));
		int tag=0;
		GUI_Shape s1 = new GUIShape();
		s1.setColor(Color.blue);
		s1.setFilled(true);
		s1.setTag(tag++);
		s1.setShape(c1);
	}
/*	public static void test1() {
		Ex4 win = new Ex4();
		GUI_Shape_Collection sc = win.getShape_Collection();
		Point2D p1 = new Point2D(0.1,0.2);
		
		Circle2D c1 = new Circle2D(p1,0.14);
		Rect2D r1 = new Rect2D(p1, new Point2D(0.5,0.45));
		Rect2D r2 = new Rect2D(p1, new Point2D(0.17,0.77));
		Point2D a1 = new Point2D(0.8,0.7), a2 = new Point2D(0.3,0.65), a3 = new Point2D(0.1,0.1);;
		Triangle2D t1 = new Triangle2D(a1,a2,a3);
		p1.move(p1);
		Segment2D seg1 = new Segment2D(new Point2D(0.2,0.6), new Point2D(0.7,0.2));
		StdDraw.setCanvasSize(Ex4_Const.Width, Ex4_Const.Height);
		StdDraw.setScale(0, 0.9);
		int tag = 0;
		GUI_Shape s1 = new GUIShape(p1,false, Color.blue, tag++);
		GUI_Shape s2 = new GUIShape(c1,true, Color.red, tag++);
		GUI_Shape s3 = new GUIShape(r1,true, Color.green, tag++);
		GUI_Shape s4 = new GUIShape(r2,false, Color.cyan, tag++);
		GUI_Shape s5 = new GUIShape(t1,false, Color.orange, tag++);
		GUI_Shape s6 = new GUIShape(seg1,false, Color.pink, tag++);
		sc.add(s1);
		sc.add(s2);
		sc.add(s3);
		sc.add(s4);
		sc.add(s5);
		sc.add(s6);
		Rect2D bb = sc.getBoundingBox();
		Point2D min = bb.getPoints()[0], max = bb.getPoints()[1];
		GUI_Shape s7 = new GUIShape(bb,false, Color.gray, tag++);
		sc.add(s7);
		double m0 = Math.min(min.x(), min.y());
		double m1 = Math.max(max.x(), max.y());
		StdDraw.setScale(m0-0.1,m1+0.1);
		win.show();
		System.out.println(sc);
		sc.save("test_save.txt");
	} */
	/**
Name, 	 Color,fill,tag,geo-shape (in case of circle2d radius is the last number).
	 * File saved:
GUIShape,255,false,0,Point2D,0.2,0.4
GUIShape,16711680,true,1,Circle2D,0.1,0.2, 0.14
GUIShape,65280,true,2,Rect2D,0.1,0.2,0.5,0.45
GUIShape,65535,false,3,Rect2D,0.1,0.2,0.17,0.77
GUIShape,16762880,false,4,Triangle2D,0.8,0.7,0.3,0.65,0.1,0.1
GUIShape,16756655,false,5,Segment2D,0.2,0.6,0.7,0.2
GUIShape,8421504,false,6,Rect2D,-0.04000000000000001,0.06,0.8,0.77
	 */
	public static void test2() {
		Ex4 win = new Ex4();
		GUI_Shape_Collection sc = win.getShape_Collection();
		sc.load("test_save.txt");
		int flag = 0;
		while(flag!=-1) { 
			Scanner sca = new Scanner(System.in);
			System.out.print("Enter a sorting method (a number in [0-5]): ");
		    String fs = sca.next();
		    flag = Integer.parseInt(fs); 
		    Shape_Comp comp = new Shape_Comp(flag);
			sc.sort(comp);
			System.out.println("**** Sorting accurding to flag="+flag+" ****");
			System.out.println(sc);
			System.out.println();
			win.show();
		}
	}
}
