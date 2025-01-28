package sort;

public class Algs {

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
	
}
