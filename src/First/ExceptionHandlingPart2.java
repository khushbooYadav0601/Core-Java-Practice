package First;

public class ExceptionHandlingPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Try Catch Finally Block in java
		//Try - a piece of code which can throw an exception
		//Catch - used to handle the exception
		//Finally - for closing an object. (finally block is always executed)
		
		
		
		//try catch and finally block
		
//		try {
//			int a = 10/0;
//		}catch(ArithmeticException ex) {
//			System.out.println(ex);
//		}finally {
//			System.out.println("Inside finally block");
//		}
//		System.out.println("Remaining code");
		
		//multiple catch block
		//most specific to most general
		//small to big
		try {
			int a[] = new int[5]; //0,1,2,3,4
			a[6] = 30/10;
		}catch(ArithmeticException e) {
			System.out.println("catch block 1");
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Catch block 2");
		}catch(Exception e) {
			System.out.println("Catch block 3");
		}
		System.out.println("Success...!!!");
		
		//Jis exception ko hum hamdle nahi karenge usko JVM khud handle kar lega.
		//har ek try block ke pass atleast one catch block hona hi chaiye but only one finally block
	}

}
