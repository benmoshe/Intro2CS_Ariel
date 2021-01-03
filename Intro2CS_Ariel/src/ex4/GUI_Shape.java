package ex4;
import java.awt.Color;


/**
 * This interface represents a GUI shape with meta data of color, fill/empty and tag.
 * It also contains a geometric shape (GeoShape).
 *  Ex4: you should NOT change this interface!
 * @author boaz.benmoshe
 */
import ex4.geometry.GeoShape;
public interface GUI_Shape {
	/** 
	 * This method returns the GeoShape from which this GUI_Shape is composed from.
	 * @return the GeoShape that this GUI_Shape is composed from. */
	public GeoShape getShape();
	/**
	 * This method sets the GeoShape to g.
	 * @param g - the new value to which the GeoShape component is set to.
	 */
	public void setShape(GeoShape g);
	/**
	 * This method return the isFill value: true iff the shape is fill.
	 * @return the fill value.
	 */
	public boolean isFilled();
	/**
	 * This method sets the fill value of this shape.
	 * @param filled - the new fill value.
	 */
	public void setFilled(boolean filled);
	/**
	 * This method returns the Color of this shape.
	 * @return the Color of this shape.
	 */
	public Color getColor();
	/**
	 * This method sets the new Color of this shape.
	 * @param cl the new Color.
	 */
	public void setColor(Color cl);
	/**
	 * This method returns the tag value (int value).
	 * @return the tag value.
	 */
	public int getTag();
	/**
	 * This method sets the tag value of this shape.
	 * @param tag
	 */
	public void setTag(int tag);
	/**
	 * This method compute a new (deep) copy of this shape.
	 * @return a new copy of this shape.
	 */
	public GUI_Shape copy();
	/**
	 * This method returns a String representation of this Shape.
	 * @return
	 */
	public String toString();
}
