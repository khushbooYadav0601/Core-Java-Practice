package DSA;

class InsertionSort {
	
	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12, 34, 52, 1, 3};
		
		for(int i=1; i<arr.length; i++) {
			int current = arr[i];
			int j = i-1;
			while(j >= 0 && current < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = current;
		}
		printArray(arr);
	}

}
