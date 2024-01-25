package First;

public class MultiplicationFloaating {
	
	static void compareFloatNum(double a, double b) {
		if(a==b) {
			System.out.println("the number are equals" + "\n");
		}
		else {
			System.out.println("The number are not equals" + "\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = (0.3 * 3) + 0.1;
		double b = 1;
		compareFloatNum(a, b);
		
		//f is to ensure that numbers are float data type
		/*float f1 = 1.5f;
		float f2 = 2.0f;
		
		float p = f1 * f2;
		System.out.println("The product is : "+ p);*/
		
				
		
	}

}
