public class shell_sort {

	 /* Method to print array*/
	 public static void printArray(int array[]){
		 int i;
		 for (i = 0; i < array.length; i++) {
			 System.out.print(array[i] + " ");
		 }
		 System.out.println();		 
	 }

	 /* Shell Sort Method */
	 public static int[] shellSort(int array[]){
		 int incr,i,temp,j;
		 int num = array.length;
		 for (incr = num / 2; incr > 0; incr /= 2){
			 for (i = incr; i < num; i++){
				 temp = array[i];
				 for (j = i; j >= incr; j -= incr){
					 	if (temp < array[j - incr]) {
					 		array[j] = array[j - incr];
					 	} 
					 	else {
					 		break;
					 		}
				 }
				 array[j] = temp;
			 }
		 }
		 return array;
	 }

	 public static void main(String args[]) {
		 int[] array = new int[] { 33, 122, -35, - 111, 9, 22, 0 , 14};
		 System.out.println("Before Sorting:");
		 printArray(array);
		 array = shellSort(array);
		 System.out.println("After Sorting:");
		 printArray(array);		 
	}

}
