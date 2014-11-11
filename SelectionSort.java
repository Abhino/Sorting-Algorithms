public class SelectionSort {
	
	  public static int[] selectionSort(int array[]){
	         
	        for (int i = 0; i < array.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < array.length; j++)
	                if (array[j] < array[index])
	                    index = j;
	      
	            int min = array[index]; 
	            array[index] = array[i];
	            array[i] = min;
	        }
	        return array;
	    }
	  
		 public static void printArray(int array[]){
			 int i;
			 for (i = 0; i < array.length; i++) {
				 System.out.print(array[i] + " ");
			 }
			 System.out.println();		 
		 }
	  
		 public static void main(String args[]) {
			 int[] array = new int[] { -232, 22, -5, -1, 99, 87, 0 , 24};
			 System.out.println("Before Sorting:");
			 printArray(array);
			 array = selectionSort(array);
			 System.out.println("After Sorting:");
			 printArray(array);		 
		}

}
