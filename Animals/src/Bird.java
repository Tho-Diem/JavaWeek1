
public class Bird extends Animal {
	private String wingColour;
	private int wingSpan;
	private String beakColour;

	public Bird(int weight, int age, int leg, String wingColour, int wingSpan, String beakColour) {
		super(weight, age, leg);
		this.wingColour = wingColour;
		this.wingSpan = wingSpan;
		this.beakColour = beakColour;

	}

	public String getwingColour() {
		return wingColour;
	}

	public void setWingColour(String wingColour) {
		this.wingColour = wingColour;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingColour(int wingSpan) {
		this.wingSpan = wingSpan;
	}

	public String getBeakColour() {
		return beakColour;
	}

	public void setBeakColour(String beakColour) {
		this.beakColour = beakColour;
	}

}
