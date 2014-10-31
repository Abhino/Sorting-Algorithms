import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Merge_Sort{

	private int[] array;
	private int[] tempArray;
	private int length;

	public static void main(String args[]) throws NumberFormatException, IOException {
		int i = 0;
		int N = 0;
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value for N");
		N = Integer.parseInt(ob.readLine());
		int arr[] = new int[N];		
		Scanner sc=new Scanner(System.in);
        System.out.println("Please enter elements...");
		for (i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Input Array is :");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		Merge_Sort obj = new Merge_Sort();
		obj.sort(arr);
		System.out.println("\n");
		System.out.println("Sorted Array is :");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void sort(int inputArray[]){
		this.array = inputArray;
		this.length = inputArray.length;
		this.tempArray = new int[length];
		MergeSort(0, length - 1);
	}

    private void MergeSort(int low, int high) {        
        if (low < high) {
            int mid = low + (high - low) / 2;

            // Sorting lower end of array
            MergeSort(low, mid);
            // Upper lower end of array
            MergeSort(mid + 1, high);
            // Merging both ends of the array
            MergeSortParts(low, mid, high);
        }
    }
    private void MergeSortParts(int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            tempArray[i] = array[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            array[k] = tempArray[i];
            k++;
            i++;
        } 
    }
}
