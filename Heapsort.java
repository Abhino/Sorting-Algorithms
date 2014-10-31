import java.util.Scanner;

public class Heapsort
{
	private static int N;
	
	public static void sorter(int array[]) {
		heapify(array);
		for (int i = N; i > 0; i--) {
			swap(array, 0, i);
			N = N - 1;
			maxheap(array, 0);
		}
	}

	public static void heapify(int array[]) {
		N = array.length - 1;
		for (int i = N / 2; i >= 0; i--)
			maxheap(array, i);
	}

	public static void maxheap(int array[], int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int parent = i;
		if (left <= N && array[left] > array[i])
			parent = left;
		if (right <= N && array[right] > array[parent])
			parent = right;
		if (parent != i) {
			swap(array, i, parent);
			maxheap(array, parent);
		}
	}

	public static void swap(int array[], int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N, i;
		System.out.println("Enter value of N");
		N = s.nextInt();
		int array[] = new int[N];
		System.out.println("Enter " + N + " Elements");
		for (i = 0; i < N; i++)
			array[i] = s.nextInt();
		sorter(array);
		System.out.println("\nElements after sorting ");
		for (i = 0; i < N; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}