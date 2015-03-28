
public class curriculum {

	public static void main(String[] args) {
		
		science bio = new science (4,3);
		english eng = new english (5 , 3);
		Math mth = new Math (20 , 2);
		
		bio.setTitle(" Intro to Biology");
		bio.setDepartment("Science");
		bio.setNumber(101);
		bio.setDescrption("Basics of biology");
		System.out.println(bio.toString());
		
		eng.setTitle("Research Analysis English");
		eng.setDepartment("English");
		eng.setNumber(111);
		eng.setDescrption("Researching topics and writing papers");
		System.out.println(eng.toString());
		
		mth.setTitle(" Calculus ");
		mth.setDepartment("Math");
		mth.setNumber(173);
		mth.setDescrption("Study of calculus");
		System.out.println(mth.toString());
		

	}

}
