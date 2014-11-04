import java.util.Scanner;
public class QuickSort {

	private int array[];
	private int length;
	
	public void sort(int[] inputArr) {
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort(0, length - 1);
	}
	
	public void quickSort(int lowerIndex, int higherIndex) {          
	        int i = lowerIndex;
	        int j = higherIndex;

	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];

	        // Divide into two arrays and partition step
	        while (i <= j) {
	            while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                swap(i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	   	    
	        if (lowerIndex < j)
	            quickSort(lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(i, higherIndex);
	    }

	public void swap(int i, int j) {
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;		
	}

	public static void main(String args[]) {
		
		QuickSort quick = new QuickSort();
		Scanner scan = new Scanner(System.in);
		int N, i;
		System.out.println("Enter value of N");
		N = scan.nextInt();
		int array[] = new int[N];
		System.out.println("Enter " + N + " Elements");
		for (i = 0; i < N; i++)
			array[i] = scan.nextInt();
		quick.sort(array);
		System.out.println("Sorted Array: ");
		for (i = 0; i < N; i++)
			System.out.print(array[i] + " ");
	}

}
