
public class readingMaterial {

	public static void main(String[] args) {
		novels nov = new novels("Fiction", "Peter Parker");
		magazines mag = new magazines("Ladybug", "Why We Need Bees");
		technicaljournals  tj = new technicaljournals("Atoms", "Issac Newton");
		textbook tex = new textbook("Computer Science", "Level 1");
		Autobiogorphy aut = new Autobiogorphy("Non-Fiction", "Alexander of Mesopotamia");
		
		nov.setCover("HardCover");
		nov.setTitle("Spiderman");
		nov.setAuthor("Stan Lee");
		nov.setPagenumber(45);
		System.out.println(nov.toString());
		
		mag.setCover("Paper Back");
		mag.setTitle("National Geographic");
		mag.setAuthor("Chad Michael Michaels");
		mag.setPagenumber(5);
		System.out.println(mag.toString());
		
		tj.setCover("E-Book");
		tj.setTitle("Atomic Bomb");
		tj.setAuthor("John Smith");
		tj.setPagenumber(500);
		System.out.println(tj.toString());
		
		tex.setCover("HardCover");
		tex.setTitle("Why Computers");
		tex.setAuthor("Kanye West");
		tex.setPagenumber(1569);
		System.out.println(tex.toString());
		
		aut.setCover("PaperBack");
		aut.setTitle("The Great Alexander");
		aut.setAuthor("Eli Cumberberry");
		aut.setPagenumber(200);
		System.out.println(aut.toString());
	}

}
