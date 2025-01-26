package sort;

public class Algs {

	public void InsertionSort (int[] arr) {
		int k = 0;
		int j = 0;
		
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

}
