package week11;
/**
 * This interface represents a set of operations on list of Strings
 * @author boaz.benmoshe
 *
 */
public interface MyListInterface {
	public void add(String a);
	public void addLast(String a);
	public boolean remove(String a);
	public boolean contains(String a);
	public String get(int i);
	public boolean isEmpty();
	public String toString();
}
