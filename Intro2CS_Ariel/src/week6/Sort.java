package week6;
import java.util.Arrays;

public class Sort {

	public static void swap(int[] arr, int i, int j)  {
	     int temp = arr[i];
	     arr[i] = arr[j];
	     arr[j] = temp;
	}

	
	public static void bubbleSort(int arr[]) {
		boolean hasChanged=true;

		for (int i=arr.length-1 ; i > 0 && hasChanged ; i-- )
		{
			hasChanged = false;
		    for (int  j=0 ; j < i ; j++ )
		    {	
			   if (arr[j] > arr[j+1])
			   {  
			         swap(arr, j, j+1);
			         hasChanged = true;
			   }        
		    }      
		}
	}

	
	public static void selectionSort(int[] arr) {
	    for (int i=0 ; i < arr.length ; i++)
	    {
	         int minIndex = i;
	         for (int j=i+1 ; j < arr.length ; j++)
	         {
	        	 if (arr[j] < arr[minIndex])
	        		 minIndex = j;
	         }
	         swap(arr, i, minIndex);
	    }
	}
	
	
	public static void selectionSortDescending(int[] arr) {
	    int maxIndex;
		for (int i=0 ; i < arr.length ; i++)
	    {
	    	maxIndex = findMaxIndex(arr,i);
	    	swap(arr, i, maxIndex);
	    }
	}
	
	
	public static int findMaxIndex(int[] arr, int start) {
		int maxIndex = start;
		for(int i=start+1; i < arr.length ;i++)
		{
			if (arr[i] > arr[maxIndex])
				maxIndex = i;
		}
		return maxIndex;
	}
	
	
	public static void insertionSort(int[] arr) {
	    for (int  i=1 ; i < arr.length ; i++)
	    {
	      for (int  j=i ; j > 0 && arr[j-1] > arr[j] ; j--)
	      {
	    	  int  temp = arr[j];
		      arr[j] = arr[j-1];
		      arr[j-1] = temp;
	      }
	   }
	}
	/**
	 * This function uses a simple additional array to implement insertion sort 
	 * @param arr
	 */
	public static void myInsertionSort(int[] arr) {
		int size = arr.length;
		int[] copy = new int[size];
	    for (int  i=0 ; i < arr.length ; i++)	    {
	    	int index = findMySortedIndex(arr,i); // compute how many entries are smaller than arr[i]
	    	int sameIndx = findHowManyAreTheSame(arr,i);
	    	copy[index+sameIndx] = arr[i];
	    }
	    for(int i=0;i<size;i=i+1) {
	    	arr[i] = copy[i];
	    }
	}
	// computes the proper index of ind in the array
	public static int findMySortedIndex(int[] a, int ind) {
		int ans = 0;
		for(int i=0;i<a.length;i=i+1) {
			if(a[i]<a[ind]) {ans = ans +1;}
		}
		return ans;
	}
	// computes the proper index of ind in the array
		public static int findHowManyAreTheSame(int[] a, int ind) {
			int ans = 0;
			for(int i=0;i<ind;i=i+1) {
				if(a[i]==a[ind]) {ans = ans +1;}
			}
			return ans;
		}
	
	public static void main(String[] args) {
		final int SIZE = 40000; // then change upto 100000
		int[] arr1 = MyArrayLibrary.randomIntArray(SIZE, SIZE);
		int[] arr2 = Arrays.copyOf(arr1,arr1.length);
		int[] arr3 = Arrays.copyOf(arr1,arr1.length);
		int[] arr4 = Arrays.copyOf(arr1,arr1.length);
		int[] arr5 = Arrays.copyOf(arr1,arr1.length);

		//////// bubbleSort
		long start = System.currentTimeMillis();
		bubbleSort(arr1);
		long end = System.currentTimeMillis();
		System.out.println("Bubble sort time = "+(end-start)/1000.0+" secs,  is sorted? "+ MyArrayLibrary.isSortedAscending(arr1));
		
		//////// selectionSort
		start = System.currentTimeMillis();
		selectionSort(arr2);
		end = System.currentTimeMillis();
		System.out.println("Selection sort time = "+(end-start)/1000.+" secs,  is sorted? "+ MyArrayLibrary.isSortedAscending(arr2));

		//////// insertionSort
		start = System.currentTimeMillis();
		insertionSort(arr3);
		end = System.currentTimeMillis();
		System.out.println("Insertion sort time = "+(end-start)/1000.+" secs,  is sorted? "+ MyArrayLibrary.isSortedAscending(arr3));

		///////// MyInsertionSort (should be slow!!)
		start = System.currentTimeMillis();
		myInsertionSort(arr4);
		end = System.currentTimeMillis();
		System.out.println("MySlowInsertion sort time = "+(end-start)/1000.+" secs,  is sorted? "+ MyArrayLibrary.isSortedAscending(arr4));
		
		////////// Java  built-in sort (Dual-pivot Quicksort)
		start = System.currentTimeMillis();
		Arrays.sort(arr4);
		end = System.currentTimeMillis();
		System.out.println("Java sort time = "+(end-start)/1000.+" secs,  is sorted? "+ MyArrayLibrary.isSortedAscending(arr4));						
		/**
		// now with a partially sorted array
		System.out.println();
		System.out.println("Now with a partially sorted array:");
		for(int i=0; i < arr1.length/100 ; i++)
			swap(arr1, (int)(Math.random()*arr1.length), (int)(Math.random()*arr1.length));
		arr2 = Arrays.copyOf(arr1,arr1.length);
		arr3 = Arrays.copyOf(arr1,arr1.length);
		arr4 = Arrays.copyOf(arr1,arr1.length);
		
		//////// bubbleSort
		start = System.currentTimeMillis();
		bubbleSort(arr1);
		end = System.currentTimeMillis();
		System.out.println("Bubble sort time = "+(end-start)/1000.+" secs,  is sorted? "+ MyArrayLibrary.isSortedAscending(arr1));
		
		//////// selectionSort
		start = System.currentTimeMillis();
		selectionSort(arr2);
		end = System.currentTimeMillis();
		System.out.println("Selection sort time = "+(end-start)/1000.+" secs,  is sorted? "+ MyArrayLibrary.isSortedAscending(arr2));

		//////// insertionSort
		start = System.currentTimeMillis();
		insertionSort(arr3);
		end = System.currentTimeMillis();
		System.out.println("Insertion sort time = "+(end-start)/1000.+" secs,  is sorted? "+ MyArrayLibrary.isSortedAscending(arr3));

		////////// Java  built-in sort (Dual-pivot Quicksort)
		start = System.currentTimeMillis();
		Arrays.sort(arr4);
		end = System.currentTimeMillis();
		System.out.println("Java sort time = "+(end-start)/1000.+" secs,  is sorted? "+ MyArrayLibrary.isSortedAscending(arr4));
		
		/// binary  search
/*		int found = binarySearch(arr4,20,0,arr4.length-1);
		if(found != -1)
			System.out.println("Found at index " + found + " the item " + arr4[found]);
		else
			System.out.println("I didn't find it");*/
		
	}
	
	
	public static int binarySearch(int[] arr, int item, int left, int right) {
		if(left>right)
			return -1;
		
		int middle = (left+right)/2;
		if(arr[middle]==item)
			return middle;
		if(arr[middle]>item)
			return binarySearch(arr,item,left,middle-1);
		else
			return binarySearch(arr,item,middle+1,right);
	}

	//sort array which contains numbers in the range [0,N]
	public static void countingSort(int[]arr, int N) {
		int index;
		N++;
		int freq[] = new int[N];
		for (int i = 0; i < arr.length; i++)
		{
			index = arr[i];
			freq[index]++;
		}
		int j = 0;
		for (int k=0; k<freq.length; k++)
			for (int i=0; i<freq[k]; i++)
				arr[j++] = k;
	}
	
	public static void countingSortV2(int[] arr) {
		int min = arr[0], max = arr[0];
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i]>max)
				max = arr[i];
			else if (arr[i]<min)
				min = arr[i];
		}
		int freq[] = new int[max-min+1];
		for (int i = 0; i < arr.length; i++)
			freq[arr[i]-min]++;
		int j = 0;
		for (int k=0; k<freq.length; k++)
			for (int i=0; i<freq[k]; i++)
				arr[j++] = k+min;
	}
}
