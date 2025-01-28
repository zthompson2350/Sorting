package sort;

public class Algs {

	// Finds unsorted values and inserts them into the correct place in the array
	public void InsertionSort (int[] arr) {
		
		int k;
		int j;
		
		for (int i = 1; i < arr.length; i++) {
			
			k = arr[i];
			j = i-1;
			
			while (j >= 0) {
				
				if (arr[j] < k) break;
				arr[j+1] = arr[j--];
				
			}
			
			arr[j+1] = k;
		}
	}

	// Selects smallest value in array and inserts it at the front of the array
	public void SelectionSort (int[] arr) {
		
		int minloc;
		int min;
		
		for (int i = 0; i < arr.length - 1; i++) {		
			
			minloc = i;
			
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[j] < arr[minloc]) {
					minloc = j;
				}
				
			}
			
			min = arr[minloc];
			arr[minloc] = arr[i];
			arr[i] = min;
			
		}
	}
	
	
	// Largest values "bubble up" to the end of the array
	public void BubbleSort (int[] arr) {
		
		int j = arr.length;
		int temp;
		
		while (j > 0) {
			
			for (int i = 0; i < j-1; i++) {
				
				if (arr[i] > arr[i+1]) {
					
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
				}
				
			}
			
			j--;
			
		}
		
	}
	
}
