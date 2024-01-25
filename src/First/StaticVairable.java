package First;

public class StaticVairable {
	
	int rollno; //instance variable
	String name;
	static String college = "ITS"; //Static variable
	 
	//constructor
	StaticVairable(int r, String n){
		rollno = r;
		name = n;
	}
	
	//method to display the values
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public class TestSttaticVariable{
	//Test class to show the values of objects
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

	}
}
