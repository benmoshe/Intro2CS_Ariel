package ex4;
/**
 * This class implements the GUI_shape.
 * Ex4: you should implement this class!
 * @author I2CS
 */
import java.awt.Color;
import ex4.geometry.*;

public class GUIShape implements GUI_Shape{

	@Override
	public GeoShape getShape() {
		return null;
	}

	@Override
	public void setShape(GeoShape g) {;
	}

	@Override
	public boolean isFilled() {
		return false;	}

	@Override
	public void setFilled(boolean filled) {
		;
	}

	@Override
	public Color getColor() {
		return null;
	}

	@Override
	public void setColor(Color cl) {
		;
	}

	@Override
	public int getTag() {
		return -1;
	}

	@Override
	public void setTag(int tag) {
		;
	}

	@Override
	public GUI_Shape copy() {
		return null;
	}
	@Override
	public String toString() {
		return null;
	}
}
