package First;

public class largestArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12, 34, 56, 2, 11};
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		System.out.println("Largest Elements in the array : ");
		System.out.println(max);
	}

}
