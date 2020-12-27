package ex4;

/**
 * This interface represents a simple GUI drawer which uses StdDraw to draw a gui_shape_collection. 
 *  Ex4: you should NOT change this interface!
 * @author boaz.benmoshe
 */
public interface Ex4_GUI {
	 /**
	  * This method inits the GUI_Shape_Collection - which will be presented bt Ex4
	  * @param g: the GUI_Shape_Collection object
	  */
	public void init(GUI_Shape_Collection g);
	/**
	 * This method returns a link to the GUI_Shape_Collection
	 * @return 
	 */
	public GUI_Shape_Collection getShape_Collection();
	/**
	 * This method presents the GUI shapes in this collection in a GUI window.
	 */
	public void show();
	/**
	 * This method returns a String containing all the "toString" of each GUI_shape in the collection.
	 * @return - a String with all the "toString"s af all shapes in the collection.
	 */
	public String getInfo();
}
