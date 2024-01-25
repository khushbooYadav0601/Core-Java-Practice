package ImmutablePackage;

public class Student {

	private final int id;
	
	private final String name;
	
	private final School school;
	
	public Student(int id, String name, School school) {
		super();
		this.id = id;
		this.name = name;
//		this.school = school;
		this.school = new School();
		this.school.setSchoolName(school.getSchoolName());
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public School getSchool() {
		return school;
	}
	
	
	
}
