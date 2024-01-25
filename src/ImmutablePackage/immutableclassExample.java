package ImmutablePackage;

public class immutableclassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class - final
		//attributes - final private
		//getter - only
		//if we are using only getter than to set the value so to set the value we use constructor.
		//set - at the time of object creation.
		
		School sc = new School("ABC");
		Student s = new Student(1, "Khushboo", sc);
		System.out.println("Id : "+s.getId() + " Name : "+s.getName()+"school name "+s.getSchool().getSchoolName());
		
		sc.setSchoolName("XYZ");
	    System.out.println("Id : "+s.getId() + " Name : "+s.getName()+"school name "+s.getSchool().getSchoolName());
	}

}
