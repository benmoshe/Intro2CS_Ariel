package week3;
/**
 * This code example demonstrates a simple GCD (Grater COmmon Divider) algorithm
 * @author boaz.benmoshe
 *
 */
public class GCD1 {

	public static void main(String[] args) {
		int x = 12;
		int y = 20;
		int t = 0;
		if(x<y) {
			t=x; x=y; y=t;
		}
		System.out.print("GCD("+x+","+y+") = ");
		while(x%y!=0) {
			x=x-y;
			if(x<y) {
				t=x; x=y; y=t;
			}
		}
		System.out.println(y);
	}
}
