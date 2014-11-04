package algos;

public class InsertionSort {
	 
    public static void main(String[] args) {
         
        int[] array = { 18, -2, 29, 66, 23, 142, -34, 0, 13 };
        System.out.println("Input Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        
        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
}