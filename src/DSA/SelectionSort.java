package DSA;

class SelectionSort {
	
	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {30, 20, 5, 10, 2};
		
		for(int i=0; i<arr.length-1; i++) {
			int smallest = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		printArray(arr);
	}
}
