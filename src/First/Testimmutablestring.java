package First;

public class Testimmutablestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Concat String
		/*String s = "Khushboo";
		s=s.concat(" Yadav");
		System.out.println(s);*/
		
		//Using == operator
		/*String s1 = "Khushboo";
		String s2 = "Yadav";
		String s3 = "Khushboo";
		System.out.println(s1==s2);
		System.out.println(s1==s3);*/
		
		//CompareTo
		String s1 = "Khushboo";
		String s2 = "Khushboo";
		String s3 = "Yadav";
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//1(because s1>s3)
		System.out.println(s1.compareTo(s1));//-1(because s3 < s1)
	}

}
