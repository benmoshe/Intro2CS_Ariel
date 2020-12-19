package ex4;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import ex4.geometry.Circle2D;
import ex4.geometry.GeoShape;
import ex4.geometry.Point2D;
import ex4.geometry.Rect2D;
/**
 * This class represents a collection of GUI_Shape.
 * Ex4: you should implement this class!
 * @author I2CS
 *
 */
public class Shape_Collection implements GUI_Shape_Collection{
	
	@Override
	public GUI_Shape get(int i) {
		return null;
	}

	@Override
	public int size() {
		return -1;
	}

	@Override
	public GUI_Shape removeElementAt(int i) {
		return null;
	}

	@Override
	public void addAt(GUI_Shape s, int i) {
		;
	}
	@Override
	public void add(GUI_Shape s) {
		;
	}
	@Override
	public GUI_Shape_Collection copy() {
		return null;
	}

	@Override
	public void sort(Comparator comp) {
		;
	}

	@Override
	public void removeAll() {
		;
	}

	@Override
	public void save(String file) {
		 ;
	}

	@Override
	public void load(String file) {
		;
	}
	@Override
	public Rect2D getBoundingBox() {
		return null;
	}
	@Override
	public String toString() {
		return null;
	}
}
