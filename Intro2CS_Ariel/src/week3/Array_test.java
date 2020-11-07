package week3;

public class Array_test {
	public static void main(String[] aa) {
		String[] ar = {"123", "aaaa", "~~~"};
	//	double[] dd = new double[13];
		double[] dd = {1,2,3,4009.4,-5};
	//	dd[3] = 4;
//		dd[2] = -13.1;
		double[] cc = new double[dd.length];
		for(int i=0;i<cc.length;i++) {cc[i] = dd[i];}
		cc=dd;
		System.out.println("cc==dd "+(cc==dd));
		dd[0]= -1;
//		double sum = 0;
		//ar[1] = ar[0]+"_ee_"+ar[2];
		for(int i=0;i<cc.length;i++) {
		//	sum = sum +dd[i];
			System.out.println("cc["+i+"] = "+cc+"  dd = "+dd);
			
		}
		
		
	}
}
