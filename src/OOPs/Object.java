package OOPs;

class Student { //this class represents a student and has the following attributes.
	
	String name; //to store the studentt's first name.
	String surname; //to store the students last name.
	int rollno; //to store the student's roll number.
	
	Student(String studentName, String studentSurname, int studentRollNo){ //class has a constructor and it takes three parameters
		//Inside the constructor, it initializes the instance variables name, surname, and rollno
		//with the values provided as arguments to the constructor.
		this.name = studentName; 
		this.surname = studentSurname;
		this.rollno = studentRollNo;
	}
	
	public void getStudentDetails() {
		System.out.println("The name of the student is "+ this.name+" "+ this.surname);
		System.out.println("The roll no of the student is "+ this.rollno);
	}	
}

class Object{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Khushboo", "Yadav", 64);
		student1.getStudentDetails();
	}
}
