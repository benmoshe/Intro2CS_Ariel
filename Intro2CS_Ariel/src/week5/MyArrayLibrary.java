package week5;

public class MyArrayLibrary {

	public static int[] randomIntArray(int size, int range){
		int[]arr = new int[size];
		++range;
		for(int i=0; i<size; i=i+1)
			arr[i] = (int)(Math.random()*range);
		return arr;
	}
	
	public static int[] randomIntArray(int size, int a, int b){
		int[]arr = new int[size];
		++b;
		for(int i=0; i<size; i=i+1)
			arr[i] = (int)(Math.random()*(b-a)) + a;
		return arr;
	}
	
	public static void printArray(int[] arr){
		int i;
		for(i=0; i<arr.length-1; i=i+1)
			System.out.print(arr[i]+", ");
		System.out.println(arr[i]);
	}
	
	public static void printArray(double[] arr){
		int i;
		for(i=0; i<arr.length-1; i=i+1)
			System.out.print(arr[i]+", ");
		System.out.println(arr[i]);
	}
	
	public static void printMatrix(int[][] mat){
		for (int i=0; i<mat.length; i++)
			printArray(mat[i]);
	}
	
	public static int[][] randomIntMatrix(int rows, int cols ,int a, int b){
		int[][] mat = new int[rows][cols];
		++b;
		for(int i=0; i<rows; i=i+1)
		{
			for (int j = 0; j < mat[0].length; j++)
				mat[i][j] = (int)(Math.random()*(b-a)) + a;
		}
		return mat;
	}
/**
 * This function computes the average of all the array values.
 * @param arr1
 * @return
 */
	public static double average(int[] arr) {
		double sum = 0;
		for(int i=0;i<arr.length;i=i+1) {
			sum = sum +arr[i];
		}
		double ave = sum / arr.length;
		return ave;
	}
	/**
	 * search for the index of the maximal value in the array;
	 * @param arr
	 * @return the index of the max entry in the array
	 */
	public static int maxIndex(int[] arr) {
		int ans = 0;
		for(int i=1;i<arr.length;i=i+1) {
			if(arr[i]>arr[ans]) {ans = i;}
		}
		return ans;
	}/**
	 * search for the index of the minimal value in the array;
	 * @param arr
	 * @return the index of the minimum entry in the array
	 */
	public static int minIndex(int[] arr) {
		int ans = 0;
		for(int i=1;i<arr.length;i=i+1) {
			if(arr[i]<arr[ans]) {ans = i;}
		}
		return ans;
	}
}
