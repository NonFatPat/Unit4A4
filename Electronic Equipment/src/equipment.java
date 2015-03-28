
public class equipment {

	public static void main(String[] args) {
		computers alien = new computers("ATX", "i72600", 1000);
		laptops apl = new laptops( "Full keyboard", "5MP", 8);
		smartphones sam = new smartphones ("Plastic", "Expandable memory");
		
		alien.setCost(1500);
		alien.setWeight(5);
		alien.setPowerusage(20);
		alien.setManufacture("Dell");
		System.out.println(alien.toString());

		apl.setCost(2500);
		apl.setWeight(2);
		apl.setPowerusage(10);
		apl.setManufacture("Apple");
		System.out.println(apl.toString());
		
		sam.setCost(800);
		sam.setWeight(1);
		sam.setPowerusage(5);
		sam.setManufacture("Samsung");
		System.out.println(sam.toString());
	}

}
