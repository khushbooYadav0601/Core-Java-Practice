package First;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CheckedException occurs at Compile Time
		//Example below: if I am storing Character value in Int data type than it shows error at compile time.
		
//		int a = "CodeMyth"; //This is a checked exception
		
		
//		Student s = new Student(); //Class not found exception
		
		//classNotFoundException
		//SQLException
		//IOExcception
		
		//Unchecked Exception occurs runtime exception
		
		//Arithematic Exception
		int a = 10;
//		int a = 5;
		int b = 0;
//		System.out.println(a/b);
		
		//NullPointerException
		String s1 = "Codemyth";
		String s2 = null;
		System.out.println(s1.length());
//		System.out.println(s2.length());
		
		//ArrayIndexOutOfBoundException
		int c[] = new int[2]; //0, 1
//		System.out.println(c[3]); 
		
		//StringIndexOutOfBoundException
		String s3 = "codemyth"; //0---7
		System.out.println(s3.charAt(5));
		System.out.println(s3.charAt(8));
	}

}
