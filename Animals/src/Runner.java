
public class Runner {

	public static void main(String[] args) {

		Bird birdy1 = new Bird(3, 4, 5, "blue", 6, "brown");
		System.out.println(birdy1.getwingColour());
		birdy1.reproduce();
	}

}
